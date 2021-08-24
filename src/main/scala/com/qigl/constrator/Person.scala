package com.qigl.constrator

import scala.beans.BeanProperty

object Person {
  def main(args: Array[String]): Unit = {
    var cat = new cat
    println(cat)
    cat.setName("2")
    println(cat.getName)
    println(cat)
    scala.Range
  }
}

class cat() {
  @BeanProperty var name: String = "1"
  var age: Int = 1
  println("----")

  override def toString = s"cat($name, $age)"
}
