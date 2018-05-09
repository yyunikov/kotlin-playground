package main.kotlin.com.yunikov.syntax

class AdvancedKotlinUser(private val id: Long) {

    var firstName: String = ""
    get() = "First name : $field"

    var lastName: String = ""
    get() = "Last name : $field"

    var email: String = ""

    constructor(): this(0L)

    override fun toString() = email
}

fun main(args: Array<String>) {
    val newUser = AdvancedKotlinUser(1L)
    with(newUser) {
        firstName = "John"
        lastName = "Doe"
        email = "johny@yunikov.com"
    }

    println("New user : $newUser")
    println(newUser.firstName)
    println(newUser.lastName)
}