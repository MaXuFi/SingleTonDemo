package com.gewuzhizhi.singletoudemo.singletonDemo;

/**
 * @program: singletouDemo
 * @description: 使用ThreadLocal方式
 * @author: llf
 * @create: 2020-06-11 16:44
 **/

/**
 * 线程安全
 * ThreadLocal会为每个线程提供一个独立的变量副本，从而隔离了多个线程对数据的访问冲突
 *
 *
 */
public class SingleTonDemo8 {

    private static final ThreadLocal<SingleTonDemo8> THREAD_LOCAL =
            new ThreadLocal<SingleTonDemo8>(){
                @Override
                protected SingleTonDemo8 initialValue() {
                    return new SingleTonDemo8();
                }
    };
    private SingleTonDemo8(){}

    public static SingleTonDemo8 getInstance(){
        return THREAD_LOCAL.get();
    }
}
