package com.qigl.abstractcontrol

/**
  * 抽象控制练习
  * 使用控制抽象,实现while循环
  */
object AbstractControlTest01 {
  def main(args: Array[String]): Unit = {
    //原while
    var x = 10
    while (x>0){
      x-=1
      println("while x :"+ x)
    }
    //新的实现
    x=10
    until(x>0){
      x-=1
      println("until x:"+x)
    }


  }
  def until(condition: => Boolean)(block : => Unit): Unit ={
    if(condition){
      block
      until(condition)(block)

    }
  }


}
