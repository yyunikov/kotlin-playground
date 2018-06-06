package main.kotlin.com.yunikov.functions

fun repeat(times: Int, lambda: () -> Unit) {
  for (i in 1..times) {
    lambda.invoke()
  }
}

fun main(args: Array<String>) {
  val awesomeFunction: (String) -> Unit = { println("$it is awesome") }

  repeat(5) {
    awesomeFunction.invoke("Kotlin")
  }
}
