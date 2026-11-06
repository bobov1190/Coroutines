package q10

import kotlinx.coroutines.*

fun main() = runBlocking {
    coroutineScope {
        launch { delay(200); println("avatar") }
        launch { delay(100); println("settings") }
    }
    println("Profile ready")

    launch { delay(100); println("late") }
    println("end of main")
}
