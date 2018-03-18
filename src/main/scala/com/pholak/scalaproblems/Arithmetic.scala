package com.pholak.scalaproblems

import com.pholak.scalaproblems.P32.gcd

object Arithmetic {

  implicit class P33(val num1: Int) extends AnyVal {
    def isCoprimeTo(num2: Int): Boolean = gcd(num1, num2) == 1
  }

  implicit class P34(val number: Int) extends AnyVal {
    def totient(): Integer = (1 to number).count(_.isCoprimeTo(number))
  }
}



