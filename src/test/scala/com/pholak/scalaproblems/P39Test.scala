package com.pholak.scalaproblems

import org.scalatest.{FunSuite, Matchers}

class P39Test extends FunSuite with Matchers {

  test("Should return list of all prime numbers in given range") {
    val result = new P39().listPrimesInRange(7 to 31)
    result should contain theSameElementsAs List(7, 11, 13, 17, 19, 23, 29, 31)
  }

}
