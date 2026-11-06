package q03

import kotlinx.coroutines.*

suspend fun loadUser() {
    println("Step 1: load user")
    delay(500)
    checkPassword()
}

suspend fun checkPassword() {
    println("Step 2: check password")
    delay(500)
    openProfile()
}

suspend fun openProfile() {
    println("Step 3: open profile")
    delay(500)
}

suspend fun main() {
    loadUser()
    println("Login finished")
}
