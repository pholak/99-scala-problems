package com.pholak.scalaproblems

import org.scalatest.{FunSuite, Matchers}

class P11Test extends FunSuite with Matchers {

  test("Should encode consecutive duplicates(only duplicates) as tuples (N, E)") {
    val encodedList = new P11().encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    encodedList should contain theSameElementsAs List((4, 'a), 'b, (2, 'c), (2, 'a), 'd, (4, 'e))
  }

}
