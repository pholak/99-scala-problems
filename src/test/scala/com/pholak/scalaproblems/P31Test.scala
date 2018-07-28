package com.pholak.scalaproblems

import com.pholak.scalaproblems.Arithmetic._

import org.scalatest.{FunSuite, Matchers}

class P31Test extends FunSuite with Matchers {

  test("Should determine that 7 is prime") {
    val result = 7.isPrime
    assert(result)
  }

  test("Should determine that 1 isn't prime") {
    val result = 1.isPrime
    assert(!result)
  }

}
