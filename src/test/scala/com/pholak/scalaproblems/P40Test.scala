package com.pholak.scalaproblems

import org.scalatest.{FunSuite, Matchers}
import com.pholak.scalaproblems.Arithmetic._


class P40Test extends FunSuite with Matchers {

  test("Should return two prime numbers that sum up to a given even integer") {
    val result = 28.goldbach()
    assert(result == (5, 23))
  }

}
