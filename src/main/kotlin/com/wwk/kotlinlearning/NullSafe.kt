package com.wwk.kotlinlearning

/**
 * Created by wwk on 17/7/8.
 *
 * 空类型安全
 * Kotlin是空安全语言, 一般类型不允许返回Null, 除非使用可Null类型
 * 任意类型都有可空和不可空两种, 不可空不加?, 可空要加?
 */
// 不可返回Null类型
fun getName(): String {
    //return null
    return "WWK"
}

// 可返回Null类型: 加个?号
fun getAddress(): String? {
    return null
}

fun main(args: Array<String>) {
    //if (getName() == null), 这个if语句总是为false

    // 可Null变量无法使用，需要加上!!， 代表让编译器放心运行，开发者已经确认过是个非NUll值了
    val value: String? = "HelloWorld"
    println(value!!.length)

    val name = getName()
    println(name.length)

    // Java写法
    //if (address == null) {
        //println("address is invalid")
    //} else {
        //println(getName().length)
    //}

    // Kotlin写法
    // 如果address不为空，便返回长度，否则返回null
    val address = getAddress()
    println(address?.length)

    // 也可以写成: 若getAddress()返回null便return, 否则便将值赋给address
    //val address: String = getAddress()?: return
    //println(address.length)

}