package com.pholak.scalaproblems

class P15() {

  def duplicateN(n: Int, list: List[Symbol]): List[Symbol] = {
      list.flatMap(List.fill(n)(_))
  }

}
