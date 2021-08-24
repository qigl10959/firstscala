package com.qigl.list


object ListTest02{
  def main(args: Array[String]): Unit = {
    var list = List(1,2,3)
    list = list:+4
    var list2 =List[Int]()
    list2 = list
    println(list2)
    println("--")
    println(list)
  }

}

class ListTest02 {


}
