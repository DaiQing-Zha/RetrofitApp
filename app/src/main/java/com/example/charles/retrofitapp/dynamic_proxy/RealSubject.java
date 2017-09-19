package com.example.charles.retrofitapp.dynamic_proxy;

import android.util.Log;

/**
 * Created by charles on 9/19/17.
 * 真实主题类（被代理类）
 */

public class RealSubject implements ISubject {
    @Override
    public void doSomething() {
        System.out.print("-----------做事");
    }
}
