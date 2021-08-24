package com.qigl.array

import scala.collection.mutable.ArrayBuffer


object ArrayTest01 {
  def main(args: Array[String]): Unit = {
    //声明一个定长数组
    var array = Array[Int](1,2,3)
    //或者
    var array2 = new Array[Int](3)
    array2(0)=1
    array2(1)=2
//    array2(2)=3
    println(array)
    println(array2)
    //遍历
    for (elem <- array) {
      println(elem)
    }
    //使用下标遍历
    for (index <- 0 until array.length){
      printf("array(%d):%d\t",index,array(index))
    }
    println()
    //声明一个变长数组
    println("声明一个变长数组")
    var arrayBuffer = new ArrayBuffer[Int]()
    //添加元素
    arrayBuffer.append(1)
    arrayBuffer.append(2)
    arrayBuffer.append(3)
    //访问遍历
    for (elem <- arrayBuffer) {
      println(elem)
    }

    //定长数组转变为变长数组
    val toBuffer = array.toBuffer
    toBuffer.append(4)
    for (elem <- toBuffer) {
      println(elem)
    }

    //变长数组转换成定长数组
    val toArray = arrayBuffer.toArray


    println("多维数组")
    //多维数组
    val dim = Array.ofDim[Double](3,4)

    dim(1)(1) = 11.11

    println(dim.mkString(","))

    //数组中常见的算法
    //求和
    val sum = array.sum
    println(sum)
    //求最大值
    val max = array.max
    println(max)
    //排序
    val array3 = Array(3,1,2)
    val sorted = array3.sorted
    for (index <- 0 until sorted.length){
      printf("array(%d):%d\t",index,sorted(index))
    }







  }

}
