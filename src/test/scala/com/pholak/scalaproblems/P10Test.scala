package com.pholak.scalaproblems

import org.scalatest.{FunSuite, Matchers}

class P10Test extends FunSuite with Matchers {

  test("Should encode consecutive duplicates as tuples (N, E) where N is the number of duplicates of the element E.") {
    val encodedList = new P10().encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    encodedList should contain theSameElementsAs List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))
  }

}
