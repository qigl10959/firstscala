package com.qigl.collecttest


import scala.collection.mutable.ArrayBuffer

object ListToScala {
  def main(args: Array[String]): Unit = {

    //Scala集合和Java集合互相转换
    val arr = ArrayBuffer[String]("1","2","3")
    import collection.JavaConverters._
    val jul: java.util.List[Int] = ArrayBuffer(1, 2, 3).asJava

//    val javaArr = new ProcessBuilder(jul)
//    import scala.collection.JavaConversions.

//    val list = javaArr.command()


  }
}
