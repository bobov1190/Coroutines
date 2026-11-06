package q04

import kotlinx.coroutines.*

suspend fun loadUser(): String {
    delay(500)
    return "Ali"
}

// this does not compile:
// fun showUser() {
//     val user = loadUser()
//     println(user)
// }

// fix 1
suspend fun showUser1() {
    println(loadUser())
}

// fix 2
fun showUser2() = runBlocking {
    println(loadUser())
}

fun main() {
    runBlocking {
        showUser1()
    }
    showUser2()
}
