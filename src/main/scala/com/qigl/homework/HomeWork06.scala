package com.qigl.homework

import java.util.{HashMap=>JavaHashMap}

import scala.beans.BeanProperty

object HomeWork06 {
  def main(args: Array[String]): Unit = {
    var student = new Student
    student.setId("first")
    student.setName("jack")
    println(student.getId+student.getName)
    var map :JavaHashMap[Nothing, Nothing] = new JavaHashMap()


  }

  class Student {
    @BeanProperty var name: String = ""
    @BeanProperty var id:String =""
  }

}
