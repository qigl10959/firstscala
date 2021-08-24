package com.qigl.homework

object HomeWork03 {
  def main(args: Array[String]): Unit = {
    /*
    编写函数计算 ,其中n是整数，使用如下的递归定义:
      = x* ,如果n是正数的话
  	  = 1
  	  = 1/ ,如果n是负数的话
  	不得使用return语句

     */

    println(powerl(2,-2))
  }
  def powerl(x:Double,n:Int): Double ={
    if(n>0){
      x*powerl(x,n-1)
    }else if(n==0){
      1
    }else {
      1/powerl(x,-n)
    }

  }
}
