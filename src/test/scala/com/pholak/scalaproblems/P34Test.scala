package com.pholak.scalaproblems

import com.pholak.scalaproblems.Arithmetic._
import org.scalatest.{FunSuite, Matchers}

class P34Test extends FunSuite with Matchers {

  test("Should calculate Euler's totient function phi(4)") {
    assert(4 == 10.totient)
  }

  test("Should calculate Euler's totient function phi(1)") {
    assert(1 == 1.totient)
  }
}
