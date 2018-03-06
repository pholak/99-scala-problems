package com.pholak.scalaproblems

import com.pholak.scalaproblems.Arithmetic._

import org.scalatest.{FunSuite, Matchers}

class P33Test extends FunSuite with Matchers {

  test("Should return true, 35 isn't coprime to 64") {
    assert(35.isCoprimeTo(64))
  }

  test("Should return false, 35 is coprime to 65") {
    assert(!35.isCoprimeTo(65))
  }

}
