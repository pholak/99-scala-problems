package com.pholak.scalaproblems

import com.pholak.scalaproblems.Arithmetic._

class P41() {
  def goldbachList(range: Range.Inclusive): Any = {
    range.filter(x => x % 2 == 0) map { x => (x, x.goldbach()) } toMap
  }

}
