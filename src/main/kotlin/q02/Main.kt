package q02

import kotlinx.coroutines.*

fun main() {
    println("with delay")
    runBlocking {
        launch { println("espresso start"); delay(300); println("espresso end") }
        launch { println("tea start"); delay(100); println("tea end") }
        launch { println("latte start"); delay(200); println("latte end") }
    }

    println("with Thread.sleep")
    runBlocking {
        launch { println("espresso start"); Thread.sleep(300); println("espresso end") }
        launch { println("tea start"); Thread.sleep(100); println("tea end") }
        launch { println("latte start"); Thread.sleep(200); println("latte end") }
    }
}
