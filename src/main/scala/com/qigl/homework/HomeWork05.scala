package com.qigl.homework

object HomeWork05 {
  def main(args: Array[String]): Unit = {
    var time = new Time(10,30)
    println("---------")
    println(time)
    var time2 = new Time(10,31)
    println(time.before(time2))

  }

}

class Time(hrs:Int,min:Int){
  val hours = hrs
  val minutes = min
  def before(ohter:Time): Unit ={
    if(ohter.hours>hours){
      println(s"$ohter")
    }else if(ohter.hours==hours && ohter.minutes>minutes){
      println(s"$ohter")
    }else{
      println(s"$this")
    }
  }

  override def toString: String = {
    this.hours+":"+this.minutes
  }
}
