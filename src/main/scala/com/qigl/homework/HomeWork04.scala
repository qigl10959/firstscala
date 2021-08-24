package com.qigl.homework

object HomeWork04 {
  def main(args: Array[String]): Unit = {

  }
  def mi(x:Double,n:Int): Double ={
    if(n==0)1
    else if (n>0)x*mi(x,n-1)
    else 1/mi(x,-n)
  }
}
