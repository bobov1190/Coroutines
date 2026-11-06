package q06

import kotlinx.coroutines.*

fun main() = runBlocking {
    for (i in 1..10) {
        launch {
            println("download $i started ${Thread.currentThread().name}")
            delay(1000)
            println("download $i finished")
        }
    }
}
