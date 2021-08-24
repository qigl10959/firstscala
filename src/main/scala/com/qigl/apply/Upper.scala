package com.qigl.apply

class Upper {
  def upper(strings: String*): Seq[String] ={
    strings.map((s:String)=> s.toUpperCase())
  }
}


object Upper{
  def main(args: Array[String]): Unit = {
    val upper = new Upper
    println(upper.upper("Hello", "World"))


  }

}
