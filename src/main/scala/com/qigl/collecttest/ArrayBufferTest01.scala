package com.qigl.collecttest

import scala.collection.mutable.ArrayBuffer

object ArrayBufferTest01 {
  def main(args: Array[String]): Unit = {
    //可变长数组的声明
    var arrayBuffer = new ArrayBuffer[Int](2)
    println(System.identityHashCode(arrayBuffer))//142666848
    //遍历
    for (elem <- arrayBuffer) {
      println(elem)
    }
    //追加
    arrayBuffer.append(0)
    println(System.identityHashCode(arrayBuffer))//142666848
    arrayBuffer.append(1)
    println(System.identityHashCode(arrayBuffer))//142666848
    println(arrayBuffer)
    //修改
    arrayBuffer(1)=10
    //访问
    println("arrayBuffer(0):"+arrayBuffer(0))
    println("arrayBuffer(1):"+arrayBuffer(1))
    //追加
    arrayBuffer.append(2)
    println(arrayBuffer)

    //删除
    arrayBuffer.remove(1)
    println(arrayBuffer)

    println(System.identityHashCode(arrayBuffer))//142666848

  }
}
