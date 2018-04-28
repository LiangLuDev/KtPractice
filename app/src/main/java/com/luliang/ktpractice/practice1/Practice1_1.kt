package com.luliang.ktpractice.practice1

import android.util.Log
import android.widget.Toast

/**
 * Created by LuLiang on 2018/4/28.
 * @author LuLiang
 * @github https://github.com/LiangLuDev
 * 定义变量、常量
 * 定义函数
 * 关键字操作
 * for循环
 *
 *
 */
class Practice1_1 {


    /**
     *定义常量 变量
     */
    fun defineVarVal() {
        val a = 100//val常量
        var b: Int//var 变量 数据类型：冒号隔开
        var c = "ccc"//字符串定义 字符串拼接
        b = a * 100 + 2
        Log.d("a", a.toString()) //100
        Log.d("b", b.toString()) //10002
        Log.d("c", "$c$a")  //ccc100
    }

    /**
     * 函数无返回值 fun noResult(){} 一样
     */
    fun noResult(str: String): Unit {
        Log.d("noResult", str)
    }

    /**
     * 三元运算 if表达式
     */
    fun ternaryOperation() {
        var a = 1
        var b = 2

        //三元
        var c = if (a > b) 3 else 4

        //if else 代码块
        var d = if (a > b) {
            3
        } else {
            4
        }
    }

    /**
     * when操作 类似java switch...case
     */
    fun whenOperator() {
        //不同操作
        var a = 0
        when (a) {
            0 -> {
            }
            1 -> {
            }
            else -> {
            }
        }
        //相同操作处理
        when (a) {
            0 -> {
            }
            1, 2 -> {
                //相同操作处理
            }
            else -> {

            }

        }

        //判断直接赋值
        val b = when (a) {
            0 -> 0
            1 -> 1
            else -> 2
        }


    }

    /**
     * 关键字 in 判断某个值在不在数组里面
     *  5是否在1-10这个数组里面 在里面为true  反之 false
     */
    fun keywordIn(): Boolean {
        return 5 in 1..10
    }

    /**
     * 关键字 is 判断对象的类型
     * Any 类似java object
     */
    fun keywordIs(x:Any) {
       when(x){
           is String ->{}
           is Int ->{}
       }
    }

    /**
     * for循环方法
     */
    fun methodFor(){
        var array:IntArray = intArrayOf(1,2,3)
        // 1
        for (i in array.indices) {
            println(array[i])
        }
        //2 index 索引 value 值
        for ((index,value) in array.withIndex()){
            Log.d("methodFor", value.toString())
        }
    }


}