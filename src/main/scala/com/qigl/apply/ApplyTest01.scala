package com.qigl.apply

object ApplyTest01 {


  def main(args: Array[String]): Unit = {

    //实例对象
    var pig =Pig()
    pig.name
    var pig2 = new Pig()
    pig2.name

    //class对象
    var pig3 = Pig


  }
}


object Pig{
  //静态的内容
  var nn :String = _

  def apply(): Pig = new Pig()

}
class Pig{
  var name :String="猪猪"
}