package com.qigl.list

object MapTrain03 {
  def main(args: Array[String]): Unit = {
    val languageToCount = Map("Scala" -> 10, "Java" -> 20, "Ruby" -> 5)
    //scala 可以省略点,并用code block 可以理解为匿名函数
    val t = languageToCount map{case (_,count)=> count+1}
    println(t)
    //case语句其实是偏函数定义的语法糖，当我们编写一个case语句时，其实等同于创建了一个具有apply与isDefineAt方法的偏函数对象。
    val t2 = languageToCount.collect{case (_,count)=> count+1}
    println(t2)
  }

}
