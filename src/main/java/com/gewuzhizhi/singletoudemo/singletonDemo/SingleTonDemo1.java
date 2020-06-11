package com.gewuzhizhi.singletoudemo.singletonDemo;

/**
 * @program: singletouDemo1
 * @description: 单例模式一 懒汉式
 * @author: llf
 * @create: 2020-06-05 16:52
 **/

/**
 * 通过提供一个静态的对象 SINGLE_TON_DEMO_1
 * 利用private修饰的构造方法和getInstance()提供一个单例
 *
 * 缺点：线程不安全，如果多个线程同时访问，会构造出多个对象
 */
public class SingleTonDemo1 {
    private static  SingleTonDemo1 SINGLE_TON_DEMO_1 ;
    private SingleTonDemo1(){}

    public static SingleTonDemo1 getInstance(){
        if (SINGLE_TON_DEMO_1==null) {
            SINGLE_TON_DEMO_1 = new SingleTonDemo1();
        }
        return SINGLE_TON_DEMO_1;
    }

}
