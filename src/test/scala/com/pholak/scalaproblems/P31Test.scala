package com.pholak.scalaproblems

import org.scalatest.{FunSuite, Matchers}

class P31Test extends FunSuite with Matchers {

  test("Should determine that 7 is prime") {
    val result = P31.isPrime(7)
    assert(result)
  }

}
