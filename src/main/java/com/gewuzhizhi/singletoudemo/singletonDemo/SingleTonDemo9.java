package com.gewuzhizhi.singletoudemo.singletonDemo;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @program: singletouDemo
 * @description: 使用CAS锁
 * @author: llf
 * @create: 2020-06-11 17:01
 **/


/**
 * 线程安全
 *
 * CAS机制当中使用了3个基本操作数：内存地址V，旧的预期值A，要修改的新值B。
 *更新一个变量的时候，只有当变量的预期值A和内存地址V当中的实际值相同时，才会将内存地址V对应的值修改为B。
 * CAS属于乐观锁，乐观地认为程序中的并发情况不那么严重，所以让线程不断去尝试更新
 *
 * 缺点：
 * CPU开销较大
 * CAS机制所保证的只是一个变量的原子性操作，而不能保证整个代码块的原子性
 */
public class SingleTonDemo9 {

    private static final AtomicReference<SingleTonDemo9> ATOMIC_REFERENCE = new AtomicReference<>();

    private SingleTonDemo9(){}

    public static final SingleTonDemo9 getInstance(){
        // 相当于while(true)
        for (;;){
            SingleTonDemo9 currentDemo9 = ATOMIC_REFERENCE.get();
            if (currentDemo9 != null){
                return currentDemo9;
            }
            currentDemo9 = new SingleTonDemo9();
            if (ATOMIC_REFERENCE.compareAndSet(null,currentDemo9)){
                return currentDemo9;
            }
        }
    }

    public static void main(String[] args) {
        SingleTonDemo9 testSingleTon = new SingleTonDemo9();
        SingleTonDemo9 testSingleTon2 = new SingleTonDemo9();
        System.out.println(testSingleTon == testSingleTon2);    //false
    }
}
