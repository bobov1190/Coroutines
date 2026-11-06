package q05

import kotlinx.coroutines.*

suspend fun getThreadName(): String {
    delay(100)
    return Thread.currentThread().name
}

fun main() = runBlocking {
    println("Before: ${Thread.currentThread().name}")
    println("Returned: ${getThreadName()}")
}
