package com.qigl.train01

object train01 {





  def main(args: Array[String]): Unit = {
    var a: BigInt = 2
    var b: BigInt = a.pow(2)
    println(b)
    println(math.sqrt(4))
    var str = "Hello"
    val arry: Array[Char] = new Array[Char](5)

    str.getChars(0,1,arry,0)
    str.getChars(1,2,arry,1)
    str.getChars(str.length-1,5,arry,2)
    str.getChars(0,0,arry,3)
    for (elem <- arry) {
      println(elem)
    }

  }

}
