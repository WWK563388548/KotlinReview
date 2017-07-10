package com.wwk.kotlinlearning

/**
 * Created by wwk on 17/7/9.
 *
 * 区间(Range)
 * eg. [0, 1024]意为大于等于0到小于等于1024的区间
 *
 * Kotlin中没有开区间的概念
 */

val range: IntRange = 0..1024 //  [0, 1024]意为大于等于0到小于等于1024的区间
val rangeExclusive: IntRange = 0 until 1024 // [0, 1023] = [[0, 1024), 意为大于等于0到小于1024的区间

val emptyRange: IntRange = 0..-1 // 空的区间

fun main(args: Array<String>) {
    println(emptyRange.isEmpty())

    println(range.contains(50)) // 与println(50 in range)等价
    println(50 in range) // 与println(range.contains(50))等价

    for (i in rangeExclusive) {
        print("$i, ")
    }
}