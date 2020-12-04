package com.example.helloworld
/*接口*/
interface Study {//接口必须全部实现
    fun readBooks()
    fun doHomework(){
        println("do homework default implementation")//接口进行默认实现
    }
}
