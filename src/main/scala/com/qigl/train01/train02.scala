package com.qigl.train01

object train02 {
  def main(args: Array[String]): Unit = {
    var a=10
    var b=20
    a^=b
    b^=a
    a^=b
    println(s"a:$a,b$b")

  }

}
