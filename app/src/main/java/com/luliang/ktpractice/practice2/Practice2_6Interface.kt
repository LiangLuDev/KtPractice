package com.luliang.ktpractice.practice2

/**
 * Created by LuLiang on 2018/5/2.
 * @author LuLiang
 * @github https://github.com/LiangLuDev
 *
 * 接口
 *
 */
interface Practice2_6Interface {
    fun getName()
    /**
     * 默认方法体的方法可以不重写
     */
    fun getAge(): Int {
        return 10
    }
}