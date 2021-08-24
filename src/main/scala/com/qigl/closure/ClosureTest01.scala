package com.qigl.closure

/**
  * 闭包的演示练习
  * 需求:
  * 1.编写一个函数 makeSuffix(suffix:String) 可以接收一个文件的后缀名,比如.jpg,并返回一个闭包
  * 2.调用闭包,可以传入一个文件名,如果该文件名没有指定的后缀,则返回文件名.后缀,如果已经有后缀,则返回原文件名
  */
object ClosureTest01 {
  def main(args: Array[String]): Unit = {

    val f = makeSuffix(".jpg")
    println(f("dog"))
    println(f("pig.jpg"))
    println(f("cat.xls"))

  }
def makeSuffix(suffix:String) ={
  (fileName:String)=>{
    if (fileName.endsWith(suffix)) {
      fileName
    }else {
      fileName+suffix
    }
  }
}


}
