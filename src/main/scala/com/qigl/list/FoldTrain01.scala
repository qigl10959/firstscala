package com.qigl.list

object FoldTrain01 {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4)
    val list2 = List(3,4,5,6)
    val i = list.foldLeft(5)(sum)
    println(i)

  }
  def sum(x:Int,y:Int): Int ={
    x + y
  }
}
