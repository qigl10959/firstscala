package com.qigl.abstractcontrol

/**
  * 控制抽象的第二个练习
  * 我修改了hot-fix分支
  * 我在没创建分支的情况下修改了代码
  * hot-fix commit 1
  */
import java.io.File
object AbstractControlTest02 {
  //获取当前路径下的文件
  val files = new File(".").listFiles()
  def main(args: Array[String]): Unit = {

    println("打印所有的文件名,开始")
    printFileName(files)
    println("打印所有的文件名,结束")
    printFileName(fileEnding("iml"))



  }
  //给调用方用于查询当前目录下符合条件的文件名，如查询以"xxx"结尾的文件
  def fileEnding(query:String) ={
    for (file <- files; if file.getName.endsWith(query))
      yield file//记住每次迭代值，并逐一存入到一个数组中,最终作为for的返回值
  }
  //基于文件名的任意部分搜索
  def filesContaining(query: String) ={
    for (file <- files; if file.getName.contains(query))
      yield file
  }
  //基于正则搜索
  def filesRegex(query: String) ={
    for (file <- files; if file.getName.matches(query))
      yield file
  }

  //改良版
  def filesMatching(query: String,matcher: (String, String) => Boolean) = {
    for (file <- files; if matcher(file.getName, query))
      yield file
  }
  //改良文件名后缀匹配
  def filesEnding2(query: String) ={
    filesMatching(query, _.endsWith(_))
  }


  //遍历打印文件名
  def printFileName(files: Array[File]): Unit ={
    val iterator = files.iterator
    for (elem <- iterator) {
      println(elem.getName)
    }
  }

}
