package com.pholak.scalaproblems

import org.scalatest.{FunSuite, Matchers}

class P13Test extends FunSuite with Matchers {

  test("Should encode list directly") {
    val encodedDirectList = new P13().encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    encodedDirectList should contain theSameElementsAs List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
  }
}
