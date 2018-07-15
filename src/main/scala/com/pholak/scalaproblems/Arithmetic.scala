package com.pholak.scalaproblems

import com.pholak.scalaproblems.P32.gcd

object Arithmetic {

  implicit class P31(val number: Int) extends AnyVal {
    def isPrime: Boolean = !((2 until number - 1) exists (number % _ == 0))
  }

  implicit class P33(val num1: Int) extends AnyVal {
    def isCoprimeTo(num2: Int): Boolean = gcd(num1, num2) == 1
  }

  implicit class P34(val number: Int) extends AnyVal {
    def totient(): Integer = (1 to number).count(_.isCoprimeTo(number))
  }

  implicit class P35(val number: Int) extends AnyVal {

    def primeFactors(): List[Int] = {
      def primeFactorsR(n: Int, primes: Stream[Int]): List[Int] = {
        if (n == 1) List()
        else if (n % 2 == 0) 2 :: primeFactorsR(n, primes)
        else if (n % primes.head == 0) primes.head :: primeFactorsR(n / primes.head, primes)
        else primeFactorsR(n, primes.drop(1))
      }

      val primes = 2 #:: Stream.from(3, 2).filter(_.isPrime)
      primeFactorsR(number, primes)
    }
  }

}



