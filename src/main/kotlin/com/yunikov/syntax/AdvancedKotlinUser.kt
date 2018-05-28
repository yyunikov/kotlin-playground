package main.kotlin.com.yunikov.syntax

class AdvancedKotlinUser(private val id: Long, val email: String?) {

  init {
    println("New Kotlin user created with id $id")
  }

  var firstName: String = ""
    get() = "First name : $field"

  var lastName: String = ""
    get() = "Last name : $field"

  constructor() : this(0L, "")

  override fun toString() = email ?: ""
}

fun main(args: Array<String>) {
  for (i in 1..10 step 2) {
    val newUser = AdvancedKotlinUser(i.toLong(), email = "johny@yunikov.com")
    with(newUser) {
      firstName = "John"
      lastName = "Doe"
    }

    println("New user : $newUser")
    println(newUser.firstName)
    println(newUser.lastName)

    println("===================")
  }
}
