package com.pholak.scalaproblems

import org.scalatest.{FunSuite, Matchers}

class P21Test extends FunSuite with Matchers {

  test("Should insert element at given position into a list") {
    val result = new P21().insertAt('new, 1, List('a, 'b, 'c, 'd))
    result should contain theSameElementsAs List('a, 'new, 'b, 'c, 'd)
  }

}
