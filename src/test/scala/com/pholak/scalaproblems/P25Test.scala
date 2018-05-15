package com.pholak.scalaproblems

import org.scalatest.{FunSuite, Matchers}

class P25Test extends FunSuite with Matchers {

  test("Should return random permutation of list") {
    val list = List('a, 'b, 'c, 'd, 'e, 'f)
    val result = P25().randomPermute(list)
    assert(result.size == list.size)
    assert(result.forall(x => list.contains(x)))
    assert(result.distinct.forall(x => result.contains(x)))
  }

}
