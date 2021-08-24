package com.qigl.train01

/**
  * 偏函数 简单理解就是对集合中的一部分元素过滤出来再用函数处理. 对应的是"全函数"
  */
object PHtest01 {
  //给定一个集合val list =(1,2,3,4,"abc"),将集合中的每一个数字+1,并返回一个新的集合,要求:忽略掉非数字的元素,返回list =(2,3,4,5)
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4,"abc")

    //单纯用map match
    //map例子中增加一个case子句，对String类型的值进行处理，则case语句就从偏函数变成了满足所有条件的“全”函数：
    //遍历判断元素类型
    val ints = list.map(deal)
    println(ints)

    //单纯使用collect
    //case语句其实是偏函数定义的语法糖，当我们编写一个case语句时，其实等同于创建了一个具有apply与isDefineAt方法的偏函数对象。
    val ints3 = list.collect{case int: Int => int+1}
    println(ints3)

    //使用偏函数
    val pf = new PartialFunction[Any,Int] {
      override def isDefinedAt(x: Any): Boolean = x.isInstanceOf[Int]

      override def apply(v1: Any): Int = v1.asInstanceOf[Int] + 1
    }

    val ints2 = list.collect(pf)
    println(ints2)




  }

  def deal(x: Any): Int = x match {
    case int: Int => x.toString.toInt+1
    case string: String => 0
  }




}
