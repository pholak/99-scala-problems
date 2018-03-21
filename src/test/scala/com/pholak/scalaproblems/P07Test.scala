package com.pholak.scalaproblems

import org.scalatest.{FunSuite, Matchers}

class P07Test extends FunSuite with Matchers {

  test("Should flatten nested list structure") {
    val flattenList = new P07().flatten(List(List(1, 1), 2, List(3, List(5, 8))))
    flattenList should contain theSameElementsAs List(1, 1, 2, 3, 5, 8)
  }

}
