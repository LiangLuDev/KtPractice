package com.luliang.ktpractice.practice6

/**
 * Created by LuLiang on 2018/5/3.
 * @author LuLiang
 * @github https://github.com/LiangLuDev
 *
 * 其他基本关键字等技术练习
 */
class Practice6_1 {
    private val i = 0

    /**
     * in关键字 元素是否在集合中
     */
    fun inFun() {

        //i是否在1-5之间
        if (i in 1..5) {
        }
        //循环输出 1-5
        for (i in 1..5) {

        }

    }

    /**
     * downTo关键字 倒序
     */
    fun downToFun() {
        //循环倒序输出 1-5
        for (i in 5 downTo 1) {
        }

    }

    /**
     * step关键字  步长
     */
    fun stepFun() {

        //循环输出 1-5 步长为2
        for (i in 1..5 step 2) {
            //输出135
        }

        //循环倒序输出 1-5 步长为2
        for (i in 5 downTo 1 step 2) {
            //输出531
        }
    }

    /**
     * until关键字  闭区间 例1-5   不包含5
     */
    fun untilFun() {

        //闭区间  不包含尾数
        for (i in 1 until 5) {
            //输出1234
        }
    }


    /**
     * as关键字  强制类型转换  强制类型转换是不安全的，如果类型不兼容会抛出ClassCastException
     */
    fun asFun() {
        var any: Any = "any"
        var str1: String = any as String


        //null转为String使用as?就不会抛异常
        var strnull = null
        var str2 = strnull as? String
    }


    /**
     * this表达式
     */
    inner class thisClass {
        
    }


}