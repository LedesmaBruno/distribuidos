object CandidatesRetriever {
    var recommendationClients = null
    var userClients = null
    var imLeader = false


    fun run(){
        synchronized(imLeader) {
            if(imLeader) {

            }
            Thread.sleep(1000)
            run()
        }
    }

    fun elected(){
        synchronized(imLeader) {
            imLeader = true
        }
    }

    fun demoted(){
        synchronized(imLeader) {
            imLeader = false
        }
    }
}