package com.qigl.train01

object DIGuiTest01 {
  def main(args: Array[String]): Unit = {
    //猴子第一天吃了一半,并多吃了一个,以后每天都吃一半,然后再多吃一个,第十天时,还没吃返现只有1个桃子了,问题:最初共多少个桃子
    //s个 s=s*0.5-1=1 day1
    //
    println("最初共有:" + eat(1) + "个桃子")
  }

  def eat(day: Int): Int = {
    if (day == 10) {
      1
    } else {
      (eat(day+1)+1)*2
    }
  }
}

