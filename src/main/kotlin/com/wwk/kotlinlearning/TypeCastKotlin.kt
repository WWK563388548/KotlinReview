package com.wwk.kotlinlearning

/**
 * Created by wwk on 17/7/9.
 *
 * 使用Kotlin重新实现TypeCast.java
 * 智能类型转换
 */

fun main(args: Array<String>) {

    //val parent: Parent = Child()
    // Kotlin中则不需要强转, 编译器已经猜出(smart cast)
    //if (parent is Child) {
        //println(parent.name)
    //}

    val strings: String? = "HelloWorld"
    if (strings != null)
        println(strings.length)

    // 防止类型转换异常
    val parent: Parent = Parent()
    // 与java中一摸一样的强转, 若失败则程序崩溃
    //val child: Child? = parent as Child
    // Kotlin的安全类型转换, 若失败程序也不崩溃, 只是返回null值
    val child: Child? = parent as? Child
    println(child)
}