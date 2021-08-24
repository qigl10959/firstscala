package com.qigl.list

import scala.collection.mutable.ArrayBuffer

object FoldTrain02 {
  //利用折叠,将字符串中的每一个字符放到数组中
  def main(args: Array[String]): Unit = {
    val str = "AAAAAAAAAAABBBBBBBBBBCCCCC"
    val array = new ArrayBuffer[Char]()
    val chars = str.foldLeft(array)(apendArray)
    println(chars)

  }

  def apendArray(arrayBuffer: ArrayBuffer[Char],char: Char): ArrayBuffer[Char] ={
    arrayBuffer.append(char)
    arrayBuffer
  }
}
