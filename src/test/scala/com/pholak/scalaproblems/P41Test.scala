package com.pholak.scalaproblems

import org.scalatest.{FunSuite, Matchers}


class P41Test extends FunSuite with Matchers {

  test("Should return Goldbach composition to numbers in given range") {
    val expectedGoldbachList = Map(
      10 -> (3, 7),
      12 -> (5, 7),
      14 -> (3, 11),
      16 -> (3, 13),
      18 -> (5, 13),
      20 -> (3, 17)
    )
    val goldbachList = new P41().goldbachList(9 to 20)
    assert(goldbachList == expectedGoldbachList)
  }

}
