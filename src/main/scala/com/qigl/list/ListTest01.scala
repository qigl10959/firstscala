package com.qigl.list

import com.qigl.op.OperateTest01

import scala.collection.mutable.ListBuffer

object ListTest01 {
  def main(args: Array[String]): Unit = {
    //创建list
    val list = List(1,2,"3")
    println(list)//List(1, 2, 3)
    //访问
    println(list(0))//1
    //添加
    val list2 = list:+50
    println(list2)//List(1, 2, 3, 50)
    //尾部添加了Nil，那么就会出现List集合里面装List集合的现象
    //List中常用'::',发音为"cons"。Cons把一个新元素组合到已有元素的最前端，然后返回结果List。
    //List有个方法叫":::"，用于实现叠加两个列表。
    val list3 = 1::2::3::list::Nil
    println(list3)//List(1, 2, 3, List(1, 2, 3))
    //尾部没有添加Nil的值，那么所有的元素都压平到一个集合里面去了
    //这里不是压平到一个集合里面去了,是执行顺序,先创建了一个list,然后在该list中添加元素,顺序是从右往左

    val list4 = 1::2::3::list
    println(list4)//List(1, 2, 3, 1, 2, 3)

    val list5 = 5::5::5::list:::Nil
    println(list5)
    //这里验证追加list的执行顺序
    val list7 = 1::2::3::list::list5::list5
    println("list6: "+list7)

    val list8 = 1::2::3::list::list5:::list5
    println("list8: "+list8)

    //变长List的创建与使用
//    val list6 =  new ListBuffer[String]
    val list6 =  ListBuffer[String]()
    list6.append("hello")
    list6.append("world")
    println(list6.mkString(","))
  //遍历
    for (elem <- list6) {
      println(elem)
    }






  }
}
