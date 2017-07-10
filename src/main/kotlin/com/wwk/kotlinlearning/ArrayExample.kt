package com.wwk.kotlinlearning

import com.wwk.kotlinlearning.shiweishuji.beijing.Shiweishuji

/**
 * Created by wwk on 17/7/10.
 *
 * 数组
 * 基本类型的数组都是定制的(涉及到装箱和拆箱的问题),
 * e.g: IntArray, ShortArray etc.
 */

// 数组的定义
val arrayOfInt: IntArray = intArrayOf(1, 3, 4, 5, 5 ,6)
val arrayOfChar: CharArray = charArrayOf('H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'l', 'd')
val arrayOfString: Array<String> = arrayOf("我", "是", "码农")
val arrayOfShuji: Array<Shiweishuji> = arrayOf(Shiweishuji("zhao"), Shiweishuji("huang"), Shiweishuji("liu"))

fun main(args: Array<String>) {
    // 查看array长度
    println(arrayOfInt.size)
    // 遍历数组
    for (int in arrayOfInt) {
        print("$int, ")
    }

    // 操作数组: 获取和修改数组元素的值
    println(arrayOfShuji[1])
    arrayOfShuji[1] = Shiweishuji("fang")
    println(arrayOfShuji[1])

    // 字符数组变成字符串: 查看下面两个语句结果的差异
    println(arrayOfChar.joinToString())
    println(arrayOfChar.joinToString(""))

    // 数组切片: 获取数组第二个到第三个元素的值
    println(arrayOfInt.slice(1..2))

}