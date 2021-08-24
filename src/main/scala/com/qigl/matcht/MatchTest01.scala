package com.qigl.matcht

object MatchTest01 {
  //模式匹配的练习
  def main(args: Array[String]): Unit = {
    val oper = "3"
    val a = 1
    val b = 2
    var res = 0
    oper match {
      case "+" => res =a+b
      case "-" => res =a-b
      case "*" => res =a*b
      case "/" => res =a/b
      case _ if oper=="3" =>println("守卫执行1")
      case _   => println("oper erro")//兜底的要放到最后,否则没有守卫就会被默认匹配
      case _ if oper=="3" =>println("守卫执行2")
    }
    println(res)

  }
}
