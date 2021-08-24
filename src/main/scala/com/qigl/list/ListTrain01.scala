package com.qigl.list


import com.qigl.list.ListTrain01.map

import scala.collection.mutable

/**
  * World Count经典案例
  * 统计集合中单词出现的次数,并按照次数排序
  */
object ListTrain01 {
  val map = mutable.Map[String,Int]()

  def main(args: Array[String]): Unit = {
    val list = List("qigl at shengb","shengb,sheng qigl qigl qigl shengb","at qigl shengb at ")
    //获取每一个集合元素
    //对每个集合元素进行按空格或逗号拆分
    //拆分后放入map中计数
    //map排序
    val string = "shengb,sheng qigl qigl qigl shengb"
    //分词计数,按照数量排序
    val stringToInt = list.foldLeft(map)(partWorld).toSeq.sortBy(x => (x._2)).toMap
    println(stringToInt)

  }
  //拆分单词,并传入map,计数
  def partWorld(map: mutable.Map[String,Int],str: String): mutable.Map[String,Int] ={
    //定义拆分字符串的间隔符,按照空格和逗号
    val sp = Array[Char](' ',',')
    //拆分字符串
    val strings = str.split(sp)
    //将拆分好的字符串赋值给循环控制变量map
    strings.foreach((sss :String)=> this.map(sss) = this.map.getOrElse(sss,0)+1)
    //返回map
    this.map
  }

  //计数
  def count1(map: mutable.Map[String,Int],str: String): mutable.Map[String,Int] ={
    map(str) = map.getOrElse(str,0)+1
    map
  }
  //插入进map,并计数
  def toMyMap(str: String): mutable.Map[String,Int] ={
    map(str) = map.getOrElse(str,0)+1
    map
  }




}
