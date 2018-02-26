package com.pholak.scalaproblems

import org.scalatest.{FunSuite, Matchers}

class P15Test extends FunSuite with Matchers {

  test("P015.duplicateN(3, List('a, 'b, 'c, 'c, 'd)) should return List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)") {
    val duplicatedList = new P15().duplicateN(3, List('a, 'b, 'c, 'c, 'd))
    duplicatedList should contain theSameElementsAs List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
  }

}
