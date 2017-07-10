package com.wwk.kotlinlearning

import sun.jvm.hotspot.HelloWorld

/**
 * Created by wwk on 17/6/29.
 *
 * 各种方法实现输出HelloWorld
 */

val FINAL_HELLO_WORLD: String = "Hello World"
var helloWorld: String = FINAL_HELLO_WORLD
var nullableHelloWorld: String? = helloWorld
val helloWorldArray: Array<Char> = arrayOf('H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'l', 'd')
val helloWorldCharArray: CharArray = charArrayOf('H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'l', 'd')
val helloWorldLength: Int = helloWorld.length
val helloWorldLengthLong: Long = helloWorldLength.toLong()

fun main(args: Array<String>) {
    println("final hello world: " + FINAL_HELLO_WORLD)
    println("assignable hello world: " + helloWorld)
    println("hello world from nullable type: " + nullableHelloWorld)
    println("hello world from Array: " + helloWorldArray.joinToString(""))
    println("hello world from CharArray: " + String(helloWorldCharArray))
    println("class name hello world: " + HelloWorld::class.java.simpleName)
    println("class name hello world: " + HelloWorld::class.java.name)
    println("the length of hello world is : " + helloWorldLength)
    println("the length of hello world is (long): " + helloWorldLengthLong)
}
