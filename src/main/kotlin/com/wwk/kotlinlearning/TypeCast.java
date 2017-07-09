package com.wwk.kotlinlearning;

/**
 * Created by wwk on 17/7/8.
 *
 * 为了解类型转换准备的类
 */
public class TypeCast {

    public static void main(String... args) {

        // Child 是Parent的子类
        Parent parent = new Child();
        // 类型强转
        System.out.println(((Child)parent).getName());

        // Java中的instanceof等同于Kotlin中的is
        // 体现出java不够智能
        if (parent instanceof Child) {
            System.out.println(((Child) parent).getName());
        }
    }
}
