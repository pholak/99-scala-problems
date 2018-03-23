package com.pholak.scalaproblems

import org.scalatest.{FunSuite, Matchers}

class P09Test extends FunSuite with Matchers {

  test("Should eliminate consecutive duplicates of list elements") {
    val packedList = new P09().pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    packedList should contain theSameElementsAs List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
  }

}
