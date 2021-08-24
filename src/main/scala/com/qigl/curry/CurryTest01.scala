package com.qigl.curry

/**
  * 函数柯里化的练习
  * 需求,比较两个字符串是否相等,忽略大小写
  */
object CurryTest01 {
  def main(args: Array[String]): Unit = {
    val s1 = "hello"
    val s2 = "HELLO"
    //原始写法调用
    println(bj(s1, s2))
    println(s1.check(s2)(bjCurry))


  }
  //原始写法
  def bj(s1:String,s2:String): Boolean ={
    s1.toUpperCase == s2.toUpperCase
  }

  //柯里化自虐写法
  def bjCurry(s1:String,s2:String): Boolean ={
    s1 == s2
  }

  //这里使用了隐式类,拓展了Sting类的功能,使String能够使用check方法
  implicit class Curry(s: String){
    def check(ss:String)(f:(String,String)=>Boolean):Boolean={
      f(s.toUpperCase,ss.toUpperCase)
    }
  }
}
