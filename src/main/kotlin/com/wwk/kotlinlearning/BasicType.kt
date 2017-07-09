package com.wwk.kotlinlearning

/**
 * Created by wwk on 17/6/29.
 */

// Boolean类型: true/false
// aBoolean和anotherBoolean是变量的名称, Boolean是变量的类型
val aBoolean: Boolean = true
val anotherBoolean: Boolean = false

// Number类型: 主要包括整形和浮点型
// Int: 32位
// Kotlin中的变量类型是Java中基本类型和装箱类型的合体, 它会自动选择是使用基本类型还是装箱类型
// Kotlin中不再区分装箱与非装箱类型
/**
 * eg: Java中:
 * int ＝ 5;
 * Integer anInteger ＝ 5;
 */
val anInt: Int = 8
val anotherInt: Int = 0xFF // 16进制
val moreInt: Int = 0b00000011 // 2进制
val maxInt: Int = Int.MAX_VALUE // Int的最大值
val minInt: Int = Int.MIN_VALUE // Int的最小值

// Long: 64位
val aLong: Long = 12368172397127391
val anotherLong: Long = 123
val maxLong: Long = Long.MAX_VALUE // Long的最大值
val minLong: Long = Long.MIN_VALUE // Long的最小值

// Float: 32位
val aFloat: Float = 2.0F
val anotherFloat: Float = 1E3f // 1乘以10的三次方
val maxFloat: Float = Float.MAX_VALUE // Float的最大值
val minFloat: Float = - Float.MIN_VALUE // Float的最小值

// Double: 64位
val aDouble: Double = 3.0
val anotherDouble: Double = 3.1415926
val maxDouble: Double = Double.MAX_VALUE // Double的最大值
val minDouble: Double = - Double.MAX_VALUE // Double的最小值

// Short: 16位
val aShort: Short = 128
val maxShort: Short = Short.MAX_VALUE // Short的最大值
val minShort: Short = Short.MIN_VALUE // Short的最小值

// Byte: 8位
val aByte: Byte = 127
val maxByte: Byte = Byte.MAX_VALUE
val minByte: Byte = Byte.MIN_VALUE

// char类型: 占两个字节, 表示一个16位的Unicode字符, 字符用单引号引起来, eg. 'a', '0', '中'
val aChar: Char = '0'
val bChar: Char = '中'
val cChar: Char = '\u000f'

// Kotlin中的类型转换不可以隐式转换
val otherInt: Int = 5
val otherLong: Long = otherInt.toLong()

fun main (args: Array<String>) {

    println(anotherInt)
    println(moreInt)
    println(maxInt)
    println(Math.pow(2.0, 31.0) - 1) // 最大值: 2的31次方减1
    println(minInt)
    println( - Math.pow(2.0, 31.0)) // 最小值: 负的2的31次方

    println()
    println(aLong)
    println(anotherLong)
    println(maxLong)
    println(minLong)

    println()
    println(aFloat)
    println(anotherFloat)
    println(maxFloat)
    println(minFloat)

    println()
    println(aDouble)
    println(anotherDouble)
    println(maxDouble)
    println(minDouble)

    println()
    println(aShort)
    println(maxShort)
    println(minShort)

    println()
    println(aByte)
    println(maxByte)
    println(minByte)

    println()
    println(aChar)
    println(bChar)
    println(cChar)
}
