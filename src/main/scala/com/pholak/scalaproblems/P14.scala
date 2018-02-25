package com.pholak.scalaproblems

class P14() {

  def duplicate(list: List[Symbol]): List[Symbol] = {
    list.flatMap(e => List(e, e))
  }

}
