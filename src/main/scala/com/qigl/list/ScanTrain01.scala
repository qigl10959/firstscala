package com.qigl.list

object ScanTrain01 {
  //扫描练习
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4)
    val ints = list.scanLeft(0)(FoldTrain01.sum)
    println(ints)

  }
}
