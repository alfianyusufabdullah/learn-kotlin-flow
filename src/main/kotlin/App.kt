import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking

@ExperimentalCoroutinesApi
fun main() = runBlocking {
    val networking = Networking()

    val response = networking.doFakeRequest().asFlow()
        .transform { id ->
            emit(networking.findDataById(id))
        }

    response.collect {
        println(it)
    }
}