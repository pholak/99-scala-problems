package com.pholak.scalaproblems

object P20 {

  def removeAt(index: Int, list: List[Symbol]) : (List[Symbol], Symbol) = {
    (list.take(index) ++ list.drop(index + 1), list(index))
  }

}
