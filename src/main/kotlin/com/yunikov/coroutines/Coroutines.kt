@file:Suppress("EXPERIMENTAL_FEATURE_WARNING")

package main.kotlin.com.yunikov.coroutines

import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.runBlocking

fun main(args: Array<String>) {
  launch { // launch new coroutine in background and continue
    delay(1000L)
    println("World!")
  }
  println("Hello,") // main thread continues here immediately
  runBlocking {     // but this expression blocks the main thread
    delay(2000L)  // ... while we delay for 2 seconds to keep JVM alive
  }
}

//fun main(args: Array<String>) = runBlocking<Unit> {
//  val job = launch { // launch new coroutine and keep a reference to its Job
//    delay(1000L)
//    println("World!")
//  }
//  println("Hello,")
//  job.join() // wait until child coroutine completes
//}
