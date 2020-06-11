package com.gewuzhizhi.singletoudemo.singletonDemo;

/**
 * @program: singletouDemo
 * @description:  加volatile的双重校验锁法
 * @author: llf
 * @create: 2020-06-11 10:26
 **/

/**
 * volatile关键字此处的作用是防止指令重排，把singleTonDemo7声明为volatile后，对它的写操作就会
 * 有一个内存屏障，这样在它赋值完成之前，都不会调用读操作。
 *
 * 注意：volatile阻止的不是singleTonDemo7 = new SingleTonDemo7(),而是在写操作完成之前，不会调用
 * if (singleTonDemo7 == null)这个读操作
 */
public class SingleTonDemo7 {

    private static volatile SingleTonDemo7 singleTonDemo7;

    private SingleTonDemo7(){}

    public static SingleTonDemo7 getInstance(){
        if (singleTonDemo7 == null){
            synchronized (SingleTonDemo7.class){
                if (singleTonDemo7 == null){
                    singleTonDemo7 = new SingleTonDemo7();
                }
            }
        }
        return  singleTonDemo7;
    }

}
