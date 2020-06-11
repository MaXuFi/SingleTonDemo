package com.gewuzhizhi.singletoudemo.singletonDemo;

/**
 * @program: singletonDemo
 * @description: 双重校验锁
 * @author: llf
 * @create: 2020-06-09 17:05
 **/

/**
 * 通常线程安全，低概率线程不安全
 *
 * 当并发情况下
 * 一、线程A进入getInstance()方法，此时单例还没有实例化，进入了锁定块
 * 二、线程B进入getInstance()方法，此时单例还没有实例化，得以访问接下来代码块，但是代码块已经被线程A锁定
 * 三、线程A进入下一判断，因为单例还没有实例化，所以实例化单例，实例化后退出代码块，解除锁定
 * 四、线程B进入下一判断，此时单例已经被实例化，退出代码块，解除锁定
 * 五、线程A拿到单例实例并返回，线程B未拿到实例返回null
 *
 */
public class SingleTonDemo6 {

    private static SingleTonDemo6 singleTonDemo6;

    private SingleTonDemo6(){}

    public static SingleTonDemo6 getInstance(){
        if (singleTonDemo6 == null){
            synchronized (SingleTonDemo6.class){
                if (singleTonDemo6 == null){
                    singleTonDemo6 = new SingleTonDemo6();
                }
            }
        }
        return singleTonDemo6;
    }
}
