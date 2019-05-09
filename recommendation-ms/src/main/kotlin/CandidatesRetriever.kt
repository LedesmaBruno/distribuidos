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
                val userServiceStubs = userClients
                    .keySet()
                    .stream().map {
                        val d = it.toStringUtf8().split(":")
                        UserServiceClient(d[0],d[1])
                    }
                    .collect(Collectors.toList())

                val candidates = userServiceStubs.first().getUsersWithLastAccess()

                val stubs = recommendationWorkers.keySet().stream().map {
                    val d = it.toStringUtf8().split(":")
                    RecommendationServiceClient(d[0],d[1])
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