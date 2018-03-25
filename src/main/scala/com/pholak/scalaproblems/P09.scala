package com.pholak.scalaproblems

class P09() {
  def pack(list: List[Symbol]): List[List[Symbol]] = {
    if (list.isEmpty) {
      List()
    } else {
      val (packedElementList, restOfList) = list.span(_ == list.head)
      List(packedElementList) ::: pack(restOfList)
    }
  }

}
