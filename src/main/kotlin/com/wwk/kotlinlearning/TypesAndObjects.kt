package com.wwk.kotlinlearning

/**
 * Created by wwk on 17/7/5.
 * Kotlin可以使用中文编程（1.1 版本以后的编译器）
 */

//class girl(val character: String, val face: String, val voice: String) {
    //init {
        //println("There is a girl, she is $character, she has $face face and her voice is $voice")
    //}
//}
//class boy(val character: String, val face: String, val voice: String) {
    //init {
        //println("There is a boy, he is $character, he has $face face and his voice is $voice")
    //}
//}

// 继承, 让代码更抽象一点(提取多个类的共性得到一个更抽象的类，即父类)，子类拥有父类的一切特征
// ${this.javaClass.simpleName}意为引用类名
// any类是所有类的父类
// 一个类能有1到n个对象，但是一个对象只能从属于一个类
// 对象也被成为类的对象或者类的实例
class girl(character: String, face: String, voice: String): human(character, face, voice)
class boy(character: String, face: String, voice: String): human(character, face, voice)

open class human(val character: String, val face: String, val voice: String) {
    init {
        println("There is ${this.javaClass.simpleName}, ta is $character, ta has $face face and ta voice is $voice")
    }
}

fun main(args: Array<String>) {
    val aGirl: girl = girl("tender", "beautiful", "so fine")
    val aBoy: boy = boy("gentle", "handsome", "so fine")
    println(aGirl is human)
    println(aBoy is human)
}


