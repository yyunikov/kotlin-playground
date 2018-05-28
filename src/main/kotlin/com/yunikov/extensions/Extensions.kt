package main.kotlin.com.yunikov.extensions

// extension function
fun <T> MutableList<T>.swap(index1: Int, index2: Int) {
  val tmp = this[index1] // 'this' corresponds to the list
  this[index1] = this[index2]
  this[index2] = tmp
}

// extension properties
val <T> List<T>.lastIndex: Int
  get() = size - 1

fun main(args: Array<String>) {
  val l = mutableListOf(1, 2, 3)
  l.swap(0, 2) // 'this' inside 'swap()' will hold the value of 'l'

  println(l)

  println(l.lastIndex)
}
