package com.pholak.scalaproblems

import org.scalatest.{FunSuite, Matchers}

class P16Test extends FunSuite with Matchers {

  test("Should drop every Nth element from list") {
    val listAfterDrop = new P16().drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    listAfterDrop should contain theSameElementsAs List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
  }

}
