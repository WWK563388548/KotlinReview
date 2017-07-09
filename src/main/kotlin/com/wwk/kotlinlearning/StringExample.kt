package com.wwk.kotlinlearning

/**
 * Created by wwk on 17/7/2.
 */
val string: String = "HelloWorld"
val fromChars: String = String(charArrayOf('H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'l', 'd'))

fun main(args: Array<String>) {
    // Kotlin中'=='与'equals()'是完全等价的, 用于比较内容
    println(string == fromChars)
    // 若想比较这两个对象是否相同, 则使用'===', 它相当于java中的'=='
    println(string === fromChars)

    println("接下来我们要输出: " + string)
    // 字符串模板
    // Java形式
    val args1: Int = 0
    val args2: Int = 1
    println("" + args1 + " + " + args2 + " = " + (args1 + args2))
    // Kotlin形式
    println("$args1 + $args2 = ${args1 + args2}")

    println("Hello, \"Trump\"")
    val salary: Int = 1000
    println("$salary")
    println("$$salary")
    println("\$salary")

    // 原始字符串
    val rawString: String = """
        /t
        /n
    $salary
    \\\\$$$salary
    \\\\$$ salary
    """
    println(rawString)
    // 字符串长度
    println(rawString.length)
}