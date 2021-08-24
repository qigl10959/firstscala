package com.qigl.op

import jdk.nashorn.internal.objects.annotations.Getter

import scala.annotation.meta.getter

/**
  * 操作符重载代码演示
  */
object OperateTest01 {
  def main(args: Array[String]): Unit = {
    val operateTest01 = new OperateTest01
    println(operateTest01.age)
    operateTest01+10
    println(operateTest01.age)



  }



}

class OperateTest01{

  private var age=0

  def +(n:Int): Unit ={
    age+=n
  }
}
