package com.pholak.scalaproblems

import org.scalatest.{FunSuite, Matchers}

class P19Test extends FunSuite with Matchers {

  test("Should rotate a list N places to the left.") {
    val result = new P19().rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    result should contain theSameElementsInOrderAs List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)
  }

  test("Should rotate a list N places to the left with negative parameter.") {
    val result = new P19().rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    result should contain theSameElementsInOrderAs List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)
  }

  test("Should rotate a list N places to the left with 0.") {
    val result = new P19().rotate(0, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    result should contain theSameElementsInOrderAs List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
  }
}
