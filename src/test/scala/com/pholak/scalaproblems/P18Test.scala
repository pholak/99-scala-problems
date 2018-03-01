package com.pholak.scalaproblems

import org.scalatest.{FunSuite, Matchers}

class P18Test extends FunSuite with Matchers {

  test("Should extract slice from a list") {
    val result = new P18().slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    result should contain theSameElementsAs List('d, 'e, 'f, 'g)
  }

}
