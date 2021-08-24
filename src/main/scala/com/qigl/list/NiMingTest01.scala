package com.qigl.list

/**
  * 匿名函数的测试练习
  */

object NiMingTest01 {
  def main(args: Array[String]): Unit = {
    val l = List(1,2,3,4)
    //原始的
    println(l.map(sum))
    //map是一个高阶函数,因此可以直接传入一个匿名函数,完成map
    println(l.map((x: Int) => x + 1))
    //list的元素可以推导出来,因此类型可以省略
    println(l.map((x) => x + 1))
    //当传入的函数只有一个参数时,可以省略括号
    println(l.map(x => x + 1))
    //如果变量只在=>右边出现一次,可以使用_替代
    println(l.map(_ + 1))
  }
  def sum(x:Int): Int ={
    x+1
  }
}
