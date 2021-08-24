package com.qigl.tuple

object TupleTest {
  def main(args: Array[String]): Unit = {
    //注意元组一旦创建之后，就是不可变的，也就是说元组当中没有添加和删除元素这一说

    //创建元组
    val tuple1 = (1,2,3,new TupleTest())
    println(tuple1)

    //访问
    val tup1 = tuple1._1
    println("tuple1_1: "+tup1)
    //遍历,利用迭代器
    for (elem <- tuple1.productIterator) {
      println(elem)
    }

    //第二种方式遍历
    tuple1.productIterator.foreach(t=>println(t))




  }

}
class TupleTest{
  override def toString: String = {
    "我是一个TupleTest"
  }
}
