package com.qigl.train01

object YeildTrain {
  def main(args: Array[String]): Unit = {
    val a = List("a","b","c")
    val b = for (e <- a)yield {
      e+"-------------"
    }
    println(b)
  }

}
