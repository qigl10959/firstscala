package com.qigl.homework

object HomeWork05_4 extends Enumeration {
  type HomeWork05_4 = Value
  val HuaZi = "花子"
  val FangGe = "方格"
  val Xin = "心形"
  val Tao = "桃形"

  def checkExists(p:String): Unit =this.values.exists(_.toString==p)

  override def toString(): String = {
    ""
  }

  def main(args: Array[String]): Unit = {

  }
}

class Pai{
  var paixing="心形"
  def this(p: String){
    this()

    paixing=p
  }
}


