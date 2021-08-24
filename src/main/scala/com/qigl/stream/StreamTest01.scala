package com.qigl.stream

object StreamTest01 {
  def main(args: Array[String]): Unit = {
    def num(n: BigInt):Stream[BigInt] = n #:: num(n+1)
    val stream = num(1)
    println(stream)
    println("head:"+stream.head)
    println(stream.tail)
    println(stream)
    val ints = stream.map(multi)
    println(ints)


  }

  def multi(n:BigInt): BigInt ={
    n+n
  }
}
