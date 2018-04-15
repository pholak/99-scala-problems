package com.pholak.scalaproblems

class P19() {

  def rotate(n: Int, list: List[Symbol]): List[Symbol] = {
    if (n == 0) list else List(split(n, list).swap).flatMap { case (list1, list2) => list1 ::: list2 }
  }

  private def split(n: Int, list: List[Symbol]) = n match {
    case n if n < 0 => list.splitAt(list.length + n)
    case n if n > 0 => list.splitAt(n)
  }
}
