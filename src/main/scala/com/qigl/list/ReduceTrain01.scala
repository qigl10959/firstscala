package com.qigl.list

object ReduceTrain01 {
  //reduceLeft练习 递归调用
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4,5)
    //第一次 1+2
    //第二次 (1+2)+3
    //第三次 ((1+2)+3)
    //第四次...
    //上次的结果作为左参数
    val i = list.reduceLeft(sum)
    println(i)


  }

  def sum(x:Int,y:Int): Int ={
    x+y
  }
}
