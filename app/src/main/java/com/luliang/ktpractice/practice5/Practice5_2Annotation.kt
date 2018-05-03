package com.luliang.ktpractice.practice5

/**
 * Created by LuLiang on 2018/5/3.
 * @author LuLiang
 * @github https://github.com/LiangLuDev
 *
 * 注解类 使用关键字 annotation 表示此类可以使用注解方式引用
 * 带构造函数  Kotlin中只允许用val声明参数
 */

@Target(AnnotationTarget.FUNCTION) //表示可以在函数中使用
annotation  class Practice5_2Annotation(val value:Int){

}