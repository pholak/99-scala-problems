package com.pholak.scalaproblems

class P11() {
  def encodeModified(list: List[Symbol]): List[Any] = {
    val encodedList = new P10().encode(list)
    encodedList.map(e => if (e._1 == 1) e._2 else e)
  }
}
