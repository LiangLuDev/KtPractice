package com.luliang.ktpractice.practice3

import android.util.Log

/**
 * Created by LuLiang on 2018/5/2.
 * @author LuLiang
 * @github https://github.com/LiangLuDev
 * 对象 匿名对象（类似java匿名内部类），匿名对象可以用作只在本地和私有作用域中声明的类型
 */
class Practice3_1Object{

    // 私有函数，所以其返回类型是匿名对象类型
    private fun getName()=object {
        val username="sss"
    }

    // 公有函数，所以其返回类型是 Any
    fun getAge()=object {
        val age=22
    }

    init {
        Log.d("d",getName().username)
//        Log.d("d",getAge().age)//编译出错
    }

}
