package com.gewuzhizhi.singletoudemo.singletonDemo;

/**
 * @program: singletonDemo
 * @description: 单例模式二 方法加synthronized的懒汉式
 * @author: llf
 * @create: 2020-06-05 16:52
 **/

/**
 * 并发不是随时都在发生，大多数时候这个锁占用的资源都浪费了
 * 虽然线程安全，但是效率不高
 */
public class SingleTonDemo2 {
    private static SingleTonDemo2 singleTonDemo2;
    private SingleTonDemo2(){}

    public static synchronized SingleTonDemo2 getInstance(){
        if (singleTonDemo2 == null) {
            singleTonDemo2 = new SingleTonDemo2();
        }
        return singleTonDemo2;
    }
}
