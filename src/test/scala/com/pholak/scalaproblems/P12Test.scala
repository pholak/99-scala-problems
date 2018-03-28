package com.pholak.scalaproblems

import org.scalatest.{FunSuite, Matchers}

class P12Test extends FunSuite with Matchers {

  test("Should decode list") {
    val decodedList = new P12().decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
    decodedList should contain theSameElementsAs List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
  }

}
