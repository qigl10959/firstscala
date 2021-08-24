package com.qigl.matcht

class CaseTest {

}

/**
  * 需求:
  * 现在有一些商品,请使用Scala设计相关的样例类,完成商品可以捆绑打折出售. 要求:
  * 1.商品捆绑可以是单个商品,也可以是多个商品
  * 2.打折时按照折扣xx元进行设计
  * 3.能够统计出所有捆绑商品打折后的最终价格
  */
object CaseTest{
  def main(args: Array[String]): Unit = {
    val bundle1 = Bundle("书籍",10.0,Book("三体",50))
    val bundle2 = Bundle("书籍",10.0,Book("天龙八部",20),Book("红楼梦",60),Bundle("食物",5,Food("零食",20)))



  }

  def price(item: Item): Double ={
    item match {
      case Book(_,price) => price
      case Bundle(_,discount,rest) => price(rest)
    }
  }


}

abstract class Item //商品项

case class Book(desc:String,price:Double) extends Item
case class Food(desc:String,price:Double) extends Item
case class Bundle(desc:String,discount:Double,item: Item*) extends Item
