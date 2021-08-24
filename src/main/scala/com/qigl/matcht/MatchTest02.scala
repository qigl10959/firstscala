package com.qigl.matcht

object MatchTest02 {
  def main(args: Array[String]): Unit = {
    //匹配数组的应用
    val arrays = Array(Array(1,2),Array(3,4,5),Array(0,1))
    for (array <- arrays) {
      val res = array match {
//        case Array(0) => println("数组只有0")
//        case Array(3,_*) => println("数组3开头")
        case Array(x,y) => {
          Array(y,x)
          println(Array(y,x)(0)+"--"+Array(y,x)(1) )
        }
        case _ => println("啥也不是")
      }
//      println(res)

    }
  }
}
