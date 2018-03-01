package com.pholak.scalaproblems

import org.scalatest.{FunSuite, Matchers}

class P22Test extends FunSuite with Matchers {

  test("Should create a list containing all integers within a given range") {
    val result = new P22().range(4, 9)
    result should contain theSameElementsAs List(4, 5, 6, 7, 8, 9)
  }

}
