package com.qigl.func

/**
  * 高阶函数练习
  */
object HigherOrdFunc {
  def main(args: Array[String]): Unit = {


  }
  /*
  def test(z:Int=>Int,x:Int): Int ={
    z(x)
  }
  def sum(x: Int): Int ={
    println("sum 单参数执行了")
    x+x
  }

  def sum(x:Int,y:Int): Int ={
    println("sum 双参数执行了")
    x+y
  }
  */
  //下面的函数都是从a到b的f(n)的累加形式（其中a<=n<=b），唯一的区别就是各种场景下f(n)的具体实现不同

  //给定两个数区间中的所有整数求和
  def self(x: Int): Int = x
  def sumInts(a: Int, b: Int): Int = sum(self, a, b)

  //求出连续整数的平方和
  def square(x: Int): Int = x * x

  def sumSquares(a: Int, b: Int): Int = {
    if(a > b) 0 else square(a) + sumSquares(a + 1, b)
  }

  //求出连续整数的关于2的幂次和
  def powerOfTwo(x: Int): Int = {
    if(x == 0) 1 else 2 * powerOfTwo(x-1)
    //假设powerOfTwo(3)
    //2*p(1)
    //2*p(0)
    //1
    //2的3次
  }
  def sumPowersOfTwo(a: Int, b: Int): Int = {
    if(a > b) 0 else powerOfTwo(a) + sumPowersOfTwo(a+1, b)
  }

  //上面的函数都是从a到b的f(n)的累加形式（其中a<=n<=b），唯一的区别就是各种场景下f(n)的具体实现不同，
  // 所以，我们可以抽取这些函数中共同的部分重新编写函数sum，并把定义的f(n)作为一个参数传入到高阶函数sum中，代码如下：
  def sum(f: Int => Int, a: Int, b: Int): Int = {
    if(a > b) 0 else f(a) + sum(f, a+1, b)
  }



  def sumInts_2(a: Int, b: Int): Int = sum(self, a, b)
  def sumSquare_2(a: Int, b: Int): Int = sum(square, a, b)
  def sumPowersOfTwo_2(a: Int, b: Int): Int = sum(powerOfTwo, a, b)



}
