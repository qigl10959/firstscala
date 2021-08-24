package com.qigl.collecttest


object ArrayTest01{
    def main(args: Array[String]): Unit = {
      //定长数组的两种声明方式
      //第一种方式
      var array = new Array[Int](3)
      //此时数组中的元素默认=0
      for (elem <- array) {
        println(elem)
      }
      //数组元素赋值
      array(0)=1
      array(1)=2
      array(2)=3
      //数组遍历1
      for (elem <- array) {
        println(elem)
      }
      //数组遍历2
      for (index <- 0 until  array.length){
        printf("array(%d):%s",index,array(index)+"\n")
      }
      //第二种方式,apply 方法
      var array2 = Array(1,2,"a")
      //关于apply方法
      ArrayTest01()


    }

  def apply(): Unit = {
    println("apply")
  }
}

class ArrayTest01 {


}