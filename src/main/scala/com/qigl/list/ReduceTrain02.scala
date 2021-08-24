package com.qigl.list

object ReduceTrain02 {
  def main(args: Array[String]): Unit = {
    //使用化简的方式,求列表中的最小值
    val list = List(1,2,3,4,5)
    val i = list.reduceLeft(comp)
    println(i)

  }
  def comp(x:Int,y:Int): Int ={
    if (x>y) x else y
  }

}
