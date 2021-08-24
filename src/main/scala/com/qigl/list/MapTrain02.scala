package com.qigl.list

import scala.collection.mutable

/**
  * val str = "AAAAAAAAABBBBBBCCCCCC"
  * 使用集合映射,统计一句话中,各个字母出现的次数
  */
object MapTrain02{
  val map = mutable.HashMap[Char,Int]()
  val map2 = mutable.HashMap[Char,Int]()
  def main(args: Array[String]): Unit = {
    val str = "AAABBC"

    //使用映射方式实现
    val ints = str.map(count)
    println(ints)
    println(ints.last)
    //使用折叠方式实现
    println("使用折叠方式实现")
    val charToInt = str.foldLeft(map2)(foldCount)
    //使用不可变map调用
    val charToInt2 = str.foldLeft(Map[Char,Int]())(foldCount2)
    println(charToInt)
    println("使用不可变map调用")
    println(charToInt2)

  }
//使用映射实现
  def count(char: Char): mutable.HashMap[Char,Int] ={
    map(char) = map.getOrElse(char,0) +1
    map
  }

  //使用可变map折叠实现
  def foldCount(map: mutable.HashMap[Char,Int],char: Char): mutable.HashMap[Char,Int] ={
    map(char) = map.getOrElse(char,0)+1
    map
  }

  //使用不可变map实现
  def foldCount2(map:Map[Char,Int],char: Char): Map[Char,Int] ={
    map + (char ->(map.getOrElse(char,0)+1))
  }



}
class MapTrain02 {

}
