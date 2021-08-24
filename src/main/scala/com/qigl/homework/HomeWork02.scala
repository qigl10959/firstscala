package com.qigl.homework

object HomeWork02 {




  def main(args: Array[String]): Unit = {
    //编写一个for循环,计算字符串中所有字母的Unicode代码（toLong方法）的乘积。举例来说，"Hello"中所有字符串的乘积为9415087488L
    var str = "Hello"
    println(product(str))
    //同样是解决前一个练习的问题，请用StringOps的foreach方式解决。
    var prod = 1L
    str.foreach(c=>prod=prod*c.toLong)
    println(prod)
    //把product函数改成递归函数
    println(reproduct(str))


  }
  def product (str: String): Long ={
    val array = str.toCharArray
    var s:Long=1
    for (i <- array ) {
      s=s*i.toLong
    }
    return s
  }

  def reproduct (str: String): Long ={
    var pro =0L
    if (str.length>1){
      pro=str.charAt(0).toLong*reproduct(str.drop(1))
    }else if(str.length==1){
      return str.charAt(0).toLong
    }
    return pro


  }
}
