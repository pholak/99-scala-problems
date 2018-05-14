package com.pholak.scalaproblems

object P20 {

  def removeAt[A](index: Int, list: List[A]) : (List[A], A) = {
    (list.take(index) ++ list.drop(index + 1), list(index))
  }

}
