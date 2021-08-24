package com.qigl.map

object MapTest01 {
  def main(args: Array[String]): Unit = {
    //构建不可变的映射
    val map = Map(1->"a",2->"b","age"->18)
    println(map)
    println(map.get(1))
    println(map(1))

    val map2 = Map[Int,String]()

    val option = map.get(1)

    println(map.getOrElse(3,"默认值"))

    //遍历
    for (elem <- map) {
      println(elem._1,elem._2)
    }
println("----------------")
    for ((k,v) <-map){
      println(k)
    }


  }
}
