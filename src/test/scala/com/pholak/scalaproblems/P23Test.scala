package com.pholak.scalaproblems

import org.scalatest.{FunSuite, Matchers}

class P23Test extends FunSuite with Matchers {

  test("Should extract a given number of randomly selected elements from a list") {
    val expectedList = List('a, 'b, 'c, 'd, 'f, 'g, 'h)
    val result = P23().randomSelect(3, expectedList)
    assert(result.size == 3)
    assert(result.distinct == result)
    assert(result.forall(element => expectedList.contains(element)))
  }

}
