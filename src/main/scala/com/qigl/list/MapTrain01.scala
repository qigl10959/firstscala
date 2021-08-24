package com.qigl.list

/**
  * 将集合中的元素全部转换成大写
  */
object MapTrain01 {
  def main(args: Array[String]): Unit = {
    val list = List[String]("Alice","Qigl","YangQing")
    val upList = list.map(toUper)

    println(upList)
    //扁平化
    val chars = list.flatMap(toUper)
    println(chars)
    println("__________________________________")




  }

  def toUper(str:String): String ={
    str.toUpperCase()
  }
  def cheng2(n :Int): Int ={
    2 * n
  }


}
