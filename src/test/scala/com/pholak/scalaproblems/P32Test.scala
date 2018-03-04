package com.pholak.scalaproblems

import org.scalatest.{FunSuite, Matchers}

class P32Test extends FunSuite with Matchers {

  test("Should return greatest common divisor of positive integer numbers") {
    val result = P32.gcd(36, 63)
    assert(result == 9)
  }

}
