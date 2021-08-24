package com.qigl.homework

object HomeWork01 {
  def main(args: Array[String]): Unit = {
    var a = {}
    println(a)
    //for(int i=10;i>=0;i–)System.out.println(i);
    for (i <- Range(10 , 0,-1)){
      println(i)
    }
    println("--------------")
    countdown(7)
    countdown(-7)
  }
/*
编写一个过程countdown(n:Int)，打印从n到0的数字
 */
  def countdown(n:Int): Unit ={
    if (n>=0){
      for (i <- Range(n , -1,-1)){
        println(i)
      }
    }else if (n<0){
      for (i <- Range(n , 1,1)){
        println(i)
      }
    }
    println("---------------------------------")

  }
}
