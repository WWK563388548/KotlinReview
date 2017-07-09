package com.wwk.kotlinlearning;

/**
 * Created by wwk on 17/7/8.
 *
 * 为证明空类型安全而编写java代码
 */
public class NullUnSafe {

    public static void main(String... args) {
        // 直接调用类，若类的返回值为空，则会出现空指针问题
        //System.out.println(getName().length());
        // 因此为防备空指针问题的出现我必须先自己进行验证
        String name = getName();
        if (name == null) {
            System.out.println("name is invalid");
        } else {
            System.out.println(getName().length());
        }

    }

    // 假设这个类是别人提供的，我并不知道它的返回值
    public static String getName() {
        //return null;
        return "";
    }
}
