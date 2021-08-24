package com.qigl.list

object FilterTrain01 {
  var startsWith :String = ""
  def main(args: Array[String]): Unit = {
    //集合过滤,A开头的
    val list = List[String]("Alice","Qigl","YangQing")
    startsWith="Q"
    val listStr = list.filter(startWith)
    val list02 = List[Int](1,2,3)
    println(listStr)
    //过滤等于1的
    val ints = list02.filter(equal0)
    println(ints)


  }
  def startWith(str : String): Boolean ={
    str.startsWith(startsWith)
  }

  def equal0(n:Int): Boolean ={
    n==1
  }

}
