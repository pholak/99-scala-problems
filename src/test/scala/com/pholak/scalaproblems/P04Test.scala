package com.pholak.scalaproblems

import org.scalatest.{FunSuite, Matchers}

class P04Test extends FunSuite with Matchers {

  test("P04.length method should return length of list") {
    val length = new P04().length(List(1, 1, 2, 3, 5, 8))
    assert(6 == length)
  }

}
