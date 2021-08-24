package com.qigl.recursion

/**
  * 递归练习
  * 实现字符串反转
  * 实现求list最大值
  * 实现求阶乘
  */
object RecursionTest01 {
  def main(args: Array[String]): Unit = {
    val string = "Hello"
    val list = List(1,2,3)
    println(rever(string))
    println(factor(31))
    println(maxV(list))


  }

  //字符串反转
  def rever(str :String): String ={
    if (str.length == 1) {
      str
    }else{
      rever(str.tail)+str.head
    }
  }
  //求阶乘
  def factor(x:BigInt): BigInt ={
    if (x==1) {
      1
    }else{
      factor(x-1) * x
    }
  }

  //求list最大值
  def maxV(list: List[Int]): Int ={
    var max = 0

    if (list.head>max) {
      max=list.head
    }

    if (list.tail.length>0) {
      maxV(list.tail)
    }


}
