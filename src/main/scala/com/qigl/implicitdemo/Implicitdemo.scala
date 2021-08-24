package com.qigl.implicitdemo

object Implicitdemo {
  def main(args: Array[String]): Unit = {
    //这是隐式类
    /*
    implicit class db(val mysql: Mysql){
      def delete(): Unit ={
        println("delete")
      }
    }
    */

    implicit def addDelete(a:Mysql): DB ={
      new DB
    }

    val mysql = new Mysql
    mysql.select()
    mysql.delete()

  }

}

class Mysql{
  def select(): Unit ={
    println("select")
  }
}

class DB{
  def delete(): Unit ={
    println("delete")
  }
}
