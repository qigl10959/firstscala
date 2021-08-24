package com.qigl.exception

object ExceptionTest01 {
  def main(args: Array[String]): Unit = {
    var a=0
    try{
      a=test()
    }catch {
      case ex:Exception=>{
        a=1
        println("捕获的异常了"+ex.getMessage)
      }
    }finally {
      println("finally执行了")
    }
    println(a)

  }

  def test(): Int ={

    throw new Exception("抛出异常了!!")
  }

}
