package com.luliang.ktpractice.practice5

import com.luliang.ktpractice.MainActivity

/**
 * Created by LuLiang on 2018/5/3.
 * @author LuLiang
 * @github https://github.com/LiangLuDev
 *
 * 反射  用类名+两个冒号::+class（如果是java类要在后面加上.java）表示获取这个类的对象
 */
class Practice5_1Reflection {
    //如果MainActivity是Kotlin的类
    var main1 = MainActivity::class
    //如果MainActivity是java的类
    var main2 = MainActivity::class.java


    /**
     * 函数引用
     */
    class Reflect(var name:String){
        fun print(){

        }
    }


    init {
        //方法一  调用invoke()函数执行print函数
        val r1 = Reflect::print
        r1.invoke(Reflect("LuLiangDev"))

        //方法二 利用Java反射机制调用getMethod()方法，并指定方法名字
        val r2 = Reflect::class.java.getMethod("print")
        r2.invoke(Reflect("LuLiangDev"))

    }

}