import com.ibm.etcd.client.utils.RangeCache
import external.RecommendationServiceClient
import external.UserServiceClient
import java.util.*
import java.util.stream.Collectors

object CandidatesRetriever {
    var imLeader = false


    fun run(recommendationWorkers: RangeCache,userClients: RangeCache){
        synchronized(imLeader) {
            if(imLeader) {
                val userClient = userClients
                    .keySet()
                    .stream()
                    .collect(Collectors.toList())[Random().nextInt(userClients.size())]

                val data = userClient.toStringUtf8().split(":")
                val stub = UserServiceClient(data[0],data[1])

                val candidates = stub.getUsersWithLastAccess()

                val stubs = userClients.keySet().stream().map {
                    val d = it.toStringUtf8().split(":")
                    RecommendationServiceClient(data[0],data[1])
                }.collect(Collectors.toList())

                candidates?.userList?.forEach {
                    stubs.first().suggestRecommendation(it.id)
                }

                Thread.sleep(3000)
                run(recommendationWorkers,userClients)
            }
        }
    }

    fun elected(recommendationWorkers: RangeCache,userClients: RangeCache){
        synchronized(imLeader) {
            imLeader = true
            run(recommendationWorkers,userClients)
        }
    }

    fun demoted(){
        synchronized(imLeader) {
            imLeader = false
        }
    }
}