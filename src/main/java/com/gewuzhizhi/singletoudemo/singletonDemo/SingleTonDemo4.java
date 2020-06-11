package com.gewuzhizhi.singletoudemo.singletonDemo;

/**
 * @program: singletonDemo
 * @description: 静态类内部加载
 * @author: llf
 * @create: 2020-06-05 17:37
 **/

/**
 * 线程安全
 *
 * 使用静态内部类的好处是，不会随着类的加载而加载，而是在调用getInstance()方法是
 * 再加载，达到类似懒汉模式的效果，而这种方式是线程安全的
 */
public class SingleTonDemo4 {
    public static class SingleTonHolder{
        private static SingleTonDemo4 singleTonDemo4 = new SingleTonDemo4();
    }

    private SingleTonDemo4(){}

    public static SingleTonDemo4 getInstance(){
        return SingleTonHolder.singleTonDemo4;
    }


}
