package com.pholak.scalaproblems

import org.scalatest.{FunSuite, Matchers}

class P14Test extends FunSuite with Matchers {

  test("P014.duplicate('a, 'b, 'c, 'c, 'd) should return List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)") {
    val duplicatedList = new P14().duplicate(List('a, 'b, 'c, 'c, 'd))
    duplicatedList should contain theSameElementsAs List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
  }

}
