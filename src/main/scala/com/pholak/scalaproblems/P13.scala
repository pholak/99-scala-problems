package com.pholak.scalaproblems

class P13() {
  def encodeDirect(list: List[Symbol]): List[(Int, Symbol)] = {
    if (list.isEmpty) {
      List()
    } else {
      val (packedElementList, restOfList) = list.span(_ == list.head)
      (packedElementList.size, packedElementList.head) :: encodeDirect(restOfList)
    }
  }

}
