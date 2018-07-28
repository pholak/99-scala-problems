package com.pholak.scalaproblems

import com.pholak.scalaproblems.P32.gcd

object Arithmetic {

  implicit class P31(val number: Int) extends AnyVal {
    def isPrime: Boolean = (number > 1) && !((2 until number - 1) exists (number % _ == 0))
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
        else if (n % primes.head == 0) primes.head :: primeFactorsR(n / primes.head, primes)
        else primeFactorsR(n, primes.drop(1))
      }

      val primes = 2 #:: Stream.from(3, 2).filter(_.isPrime)
      primeFactorsR(number, primes)
    }
  }

  implicit class P36(val number: Int) extends AnyVal {

    def primeFactorMultiplicity(): List[(Int, Int)] = {
      number.primeFactors().groupBy(i => i).mapValues(_.size).toSeq.sortBy(_._1).toList
    }
  }

  implicit class P40(val number: Int) extends AnyVal {
    def goldbach(): (Integer, Integer) = {
      val primes = new P39().listPrimesInRange(2 to number)
      primes.combinations(2).toList.filter(pair => pair.sum == number).head match {
        case List(a, b) => (a, b)
      }
    }
  }

}



