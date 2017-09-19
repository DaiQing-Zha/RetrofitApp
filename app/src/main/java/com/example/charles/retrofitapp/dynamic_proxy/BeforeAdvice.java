package com.example.charles.retrofitapp.dynamic_proxy;

/**
 * Created by charles on 9/19/17.
 * 前置通知类
 */

public class BeforeAdvice implements IAdvice {
    @Override
    public void execute() {
        System.out.println("------------我是前置通知，我被执行了！！！");
    }
}
