package com.pholak.scalaproblems

import org.scalatest.FunSuite

class P02Test extends FunSuite{

  test("P02.penultimate method should return penultimate element from list") {
    val penultimate = new P02().penultimate(List(1, 1, 2, 3, 5, 8))
    assert(5 == penultimate)
  }

}
