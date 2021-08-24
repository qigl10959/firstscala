package com.qigl.queue

import scala.collection.mutable

object QueueTest01 {
  def main(args: Array[String]): Unit = {
    //创建一个可变的队列
    val quue = new mutable.Queue[Any]()
    //添加元素
    quue+=1
    quue+=2
    println(quue)
    //删除元素,弹出,先入先出
    quue.dequeue()
    println(quue)

    //向队列添加队列
    quue.enqueue("a",3,4,"c")
    println(quue)

    //返回队列的第一个元素
    println("head:"+quue.head)
    //返回队列的最后一个队列
    println("last:"+quue.last)
    //返回除第一个元素以外的剩余元素的队列 对原队列无影响
    println("tail:"+quue.tail)
    println(quue)


  }
}
