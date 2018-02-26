package com.pholak.scalaproblems

class P15() {

  def duplicateN(n: Int, list: List[Symbol]): List[Symbol] = {
      list.flatMap(e => List.fill(n)(e))
  }

}
