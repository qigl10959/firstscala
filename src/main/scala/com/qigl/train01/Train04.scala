package com.qigl.train01

object Train04 {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 10) {
      println("a")
    }
    var list = List("a","b","c")
    for (elem <- list) {
      println(elem)
    }

  }
}
