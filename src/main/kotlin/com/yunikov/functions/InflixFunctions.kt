package main.kotlin.com.yunikov.functions

data class Foo(val value: Int)

infix fun Int.mod(x: Int): Int {
  return this % x
}

infix operator fun Foo.plus(other: Foo): Int {
  return value + other.value
}

fun main(args: Array<String>) {
  println(2 mod 2)
  println(Foo(1) + Foo(4))
}
