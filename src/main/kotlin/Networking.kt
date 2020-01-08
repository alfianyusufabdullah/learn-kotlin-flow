import kotlinx.coroutines.*

class Networking {
    suspend fun doFakeRequest(): IntRange {
        return withContext(CoroutineScope(Dispatchers.Default).coroutineContext) {
            delay(2000)
            1..10
        }
    }

    suspend fun findDataById(id: Int): String  {
        return withContext(CoroutineScope(Dispatchers.Default).coroutineContext) {
            delay(2000)
            "https://api.example.com/$id"
        }
    }
}