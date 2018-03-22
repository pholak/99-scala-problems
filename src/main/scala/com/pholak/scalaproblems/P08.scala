package com.pholak.scalaproblems

class P08() {

  def compress[A](list: List[A]): List[A] = list match {
    case firstElement :: restOfList => firstElement :: compress(restOfList.dropWhile(_ == firstElement))
    case Nil => Nil
  }

}
