package com.pholak.scalaproblems

class P07 {

  def flatten(ls: List[Any]): List[Any] = ls flatMap {
    case list: List[_] => flatten(list)
    case singleElement => List(singleElement)
  }

}
