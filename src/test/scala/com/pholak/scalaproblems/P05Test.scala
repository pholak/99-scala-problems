package com.pholak.scalaproblems

import org.scalatest.{FunSuite, Matchers}

class P05Test extends FunSuite with Matchers {

  test("P05.reverse method should return reversed list") {
    val reversedList = new P05().reverse(List(1, 1, 2, 3, 5, 8))
    reversedList should contain theSameElementsAs List(8, 5, 3, 2, 1, 1)
  }

}

