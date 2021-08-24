package com.qigl.chapter01

object TestScala {
  def main(args: Array[String]): Unit = {
    printf("hello scala ,idea...")
    var name: String = "小明"
    var age: Int = 10
    var sex: String = "男"
    var sal: Float = 10.67f
    var heigh: Double = 180.5
    println()

    printf("名字:%s  年龄:%d 性别:%s 薪资:%.2f 身高:%.3f", name, age, sex, sal, heigh)
    println()
    println(s"姓名:$name \t 年龄:$age 薪资:${sal * 10}")

    var array = new Array[Int](10)
    for (elem <- array) {
      println("elem:" + elem)
    }

  }
}
