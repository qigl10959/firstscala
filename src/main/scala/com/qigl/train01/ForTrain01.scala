package com.qigl.train01

object ForTrain01 {
  def main(args: Array[String]): Unit = {
    //打印1~100之间,是9的倍数的整数的,个数及总和
    var count = 0
    var sum = 0
    for (i <- 1 to 100 if i%9==0){
      count+=1
      sum+=i
      println(s"9的倍数的整数:${i},个数:$count,累计和:$sum")
    }
  }

}
