package com.qigl.list

class MyList {
  //模拟List的map映射,深刻理解高阶函数
  val myList = List(1,2,3)
  var list_e = List[Int]()

  def map(f:Int=>Int): MyList ={
    for (el <- myList){
      list_e = list_e :+ f(el)
    }
    this
  }
}

object MyList{
  def main(args: Array[String]): Unit = {
    val myList = new MyList
    println(myList.map(mut).list_e)
  }


  def mut(n:Int): Int ={
    2 * n
  }
}
