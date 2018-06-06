package main.kotlin.com.yunikov.functions

import java.util.concurrent.locks.Lock
import java.util.concurrent.locks.ReentrantLock

inline fun <T> lock(lock: Lock, body: () -> T): T {
  lock.lock()
  try {
    return body.invoke()
  }
  finally {
    lock.unlock()
  }
}

fun main(args: Array<String>) {
  lock(ReentrantLock()) {
    println("Hello Kotlin")
  }
}
