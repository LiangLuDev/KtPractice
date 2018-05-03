package com.luliang.ktpractice.practice4

import android.util.Log

/**
 * Created by LuLiang on 2018/5/2.
 * @author LuLiang
 * @github https://github.com/LiangLuDev
 * 函数
 */
class Practice4_1Fun {


    /**
     * 函数声明（有参数和返回值）
     */
    fun foo(x: Int): String {
        Log.d("foo", "$x")
        return "$x"
    }

    /**
     * 无默认值参数在有默认值参数后面 调用要使用命名参数来指定值 foo(y=1)
     */
    fun foo(x: String = "str", y: Int) {
        Log.d("foo.x", x)
        Log.d("foo.y", "$y")
    }

    /**
     * 可变数量的参数 使用修饰符 vararg    类似java  foo(T... strs)
     */
    fun <T> foo(vararg strs: T) {
        strs.forEach { Log.d("foo", it.toString()) }
    }

    /**
     * 函数的函数体只有一条语句，并且有返回值，那么可以省略函数体的大括号，变成单表达式函数
     */
//    fun foo():String{
//        return "foo"
//    }
    //单函数表达式
    fun foo() = "foo"

    /**
     * 内部函数（局部函数 java没有）  函数内嵌套另一个函数，嵌套在里面的函数成为局部函数
     */
    fun fooInside() {
        Log.d("fooInside", "fooInside")

        fun inside() {
            Log.d("inside", "inside")
        }

        inside()
    }

    /**
     * 泛型函数
     */
    fun <T> fooFun(t: T) {

    }

    /**
     * 递归函数 tailrec修饰符 并将其自身调用作为它执行的最后一个操作
     */
    tailrec fun count(x: Int = 1):
            Int = if (x == 10) x else count(x - 1)


    /**
     * 匿名函数 函数体是表达式，也可以是代码段
     */
    fun AnonymousFun() {
        var s=fun(x: Int, y: Int): Int = x + y
    }


    init {
        //函数调用
        foo(1)
        //参数默认值函数
        foo(y = 1)
        //可变数量参数函数
        foo(1, 11, 1111, 11111, "hehe")
        //局部函数
        fooInside()

        count()

    }
}
