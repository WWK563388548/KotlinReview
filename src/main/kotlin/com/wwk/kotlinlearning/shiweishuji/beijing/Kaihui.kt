package com.wwk.kotlinlearning.shiweishuji.beijing

import com.wwk.kotlinlearning.shiweishuji.shanghai.Shiweishuji
// 给包取一个别名，用来引用
import com.wwk.kotlinlearning.shiweishuji.shenzhen.Shiweishuji as shenzhenshiwei

/**
 * Created by wwk on 17/7/9.
 *
 * 使用包(package)
 * 包其实就是命名空间
 *
 * 包, 对应它所在文件系统的路径
 * 包, 不一定与路径完全对应, 但通常不这么干
 * 包的声明必须是非注释代码的第一行
 */
fun main(args: Array<String>) {

    val beijingShiweishuji: Shiweishuji = Shiweishuji("zhang")
    //val shanghaiShiweishuji: com.wwk.kotlinlearning.shiweishuji.shanghai.Shiweishuji = com.wwk.kotlinlearning.shiweishuji.shanghai.Shiweishuji("li")
    val shanghaiShiweishuji: Shiweishuji = Shiweishuji("li")
    val shenzhenShiweishuji: shenzhenshiwei = shenzhenshiwei("wang")
}