package main.kotlin.com.yunikov.syntax

class AdvancedKotlinUser(private val id: Long, private val email: String) {

    var firstName: String = ""
    get() = "First name : $field"

    var lastName: String = ""
    get() = "Last name : $field"

    constructor(): this(0L, "")

    override fun toString() = email
}

fun main(args: Array<String>) {
    val newUser = AdvancedKotlinUser(1L, email = "johny@yunikov.com")
    with(newUser) {
        firstName = "John"
        lastName = "Doe"
    }

    println("New user : $newUser")
    println(newUser.firstName)
    println(newUser.lastName)
}