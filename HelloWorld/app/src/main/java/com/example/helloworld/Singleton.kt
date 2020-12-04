package com.example.helloworld

/*单例类：构造函数私有化，禁止其他类调用，然后给出一个构造方法，如果没有实现就创建一个实现，否则直接返回已经有的实现*/
object Singleton{ //object关键字
    fun singletonTest(){
        println("singletonTest ois called.")
    }
}