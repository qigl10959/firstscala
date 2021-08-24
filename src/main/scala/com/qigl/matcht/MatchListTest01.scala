package com.qigl.matcht

object MatchListTest01 {
  //匹配列表练习
  def main(args: Array[String]): Unit = {
    val array = Array(List(1,2),List(1,2,3),List(0,2,3),List(0,0,0,0),List(0))
    for (elem <- array) {
      elem match {
        case 0::Nil => println("只有一个0元素"+elem)
        case 0::x::y::Nil => println("0开头的,三个元素的"+elem)
        case 1:: other => println("1开头的"+elem)
        case _ => println("其他"+elem)
      }
    }
  }
}
