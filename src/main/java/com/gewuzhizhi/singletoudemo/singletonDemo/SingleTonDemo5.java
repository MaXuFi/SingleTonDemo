package com.gewuzhizhi.singletoudemo.singletonDemo;

/**
 * @program: singletonDemo
 * @description: 枚举方法
 * @author: llf
 * @create: 2020-06-09 16:50
 **/

/**
 * Effective java 作者Josh Bloch提倡的方式，解决了以下三个问题
 * 一、自由串行化
 * 二、保证只有一个单例
 * 三、线程安全
 */
public enum  SingleTonDemo5 {
    INSTANCE;

    public static void main(String[] args) {
        SingleTonDemo5 instance = SingleTonDemo5.INSTANCE;

    }


}
