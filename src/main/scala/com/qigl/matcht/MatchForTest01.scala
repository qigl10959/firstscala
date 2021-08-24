package com.qigl.matcht

object MatchForTest01 {
  def main(args: Array[String]): Unit = {
    val map = Map(1->"A",2->"B",3->3,4->"D",5->"A")
    println(map)
    for ((k,v) <- map if v == "A") {
      println(k)
    }
    println("------------------------")
    for ((k,"A") <- map) {
      println(k)
    }



  }
}
