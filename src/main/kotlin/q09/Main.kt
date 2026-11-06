package q09

import kotlinx.coroutines.*

fun main() = runBlocking {
    val parent = launch {
        repeat(2) { i ->
            launch {
                try {
                    delay(1000)
                } finally {
                    println("cleanup $i")
                }
            }
        }
    }
    delay(100)
    parent.cancelAndJoin()
    println("end")
}
