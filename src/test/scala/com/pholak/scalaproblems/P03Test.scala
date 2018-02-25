package com.pholak.scalaproblems

import org.scalatest.FunSuite

class P03Test extends FunSuite{

  test("P03.nth method should nth element from list") {
    val nth = new P03().nth(2, List(1, 1, 2, 3, 5, 8))
    assert(2 == nth)
  }

}
