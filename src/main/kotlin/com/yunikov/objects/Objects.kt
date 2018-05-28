package main.kotlin.com.yunikov.objects

object FooObject {
  const val KOTLIN_IS_AWESOME = "Kotlin is awesome"
}

interface FooInterface { fun count() }

class Foo {
  fun method(counter: FooInterface) {
    counter.count()
  }
}

fun main(args: Array<String>) {
  println(FooObject.KOTLIN_IS_AWESOME)

  var i = 0
  val foo = Foo()

  val counter: FooInterface = object : FooInterface {
    override fun count() {
      i++
    }
  }

  foo.method(counter)
  foo.method(counter)
  foo.method(counter)

  println("Number of calls to method count() = $i")

  // Object expressions

  val adHoc = object {
    var x: Int = 0
    var y: Int = 0
  }
  print("x = ${adHoc.x}, y = ${adHoc.y}")
}
