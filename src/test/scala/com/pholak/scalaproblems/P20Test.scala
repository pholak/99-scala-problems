package com.pholak.scalaproblems

import org.scalatest.{FunSuite, Matchers}

class P20Test extends FunSuite with Matchers {

  test("Should remove element at given index") {
    val (resultList, removedElement) = new P20().removeAt(1, List('a, 'b, 'c, 'd))
    resultList should contain theSameElementsAs List('a, 'c, 'd)
    assert(removedElement == 'b)
  }

}
