package com.gewuzhizhi.singletoudemo.singletonDemo;

/**
 * @program: singletouDemo
 * @description: 单例模式三  饿汉式
 * @author: llf
 * @create: 2020-06-05 17:15
 **/

/**
 *  线程安全
 *  相比于静态方类，内存常驻
 */
public class SIngleTonDemo3 {

    private static SIngleTonDemo3 sIngleTonDemo3 = new SIngleTonDemo3();
    private SIngleTonDemo3(){}

    public static SIngleTonDemo3 getInstance(){
        return sIngleTonDemo3;
    }
}
