package com.qigl.homework

object HomeWork07 {

}

class Conversions{
  def inchesToCentimeters(): Unit ={

  }
  def gallonsToLiters(): Unit ={

  }
  def milesToKilometers(): Unit ={

  }

}

class Point {
  var age = 0
  var num = 0
  def this(age: Int,num: Int){
    this()
    this.age=age
    this.num=num

  }


  override def toString: String = "\tage:"+this.age+";num:"+this.num
}
object Point{
  def apply(age: Int,num: Int): Point = new Point(age,num)

  def apply(string: String): Unit= {
    println(string)
    val strings = string.split(" ")
    val reverse = strings.reverse
    for (elem <- reverse) {
      println(elem)
    }
    println(reverse)
  }
  
  def main(args: Array[String]): Unit = {
//    val point = Point(3,4)
    val point = new Point(3,4)
    println(point)
    val p2 = Point(5,6)
    println("p2:"+p2)
    println("------------------------------------------------------------------")
    Point("Hello World")

  }
}



