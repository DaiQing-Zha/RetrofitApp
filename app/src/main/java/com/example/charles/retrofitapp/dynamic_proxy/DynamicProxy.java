package com.example.charles.retrofitapp.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by charles on 9/19/17.
 * 动态代理类
 */

public class DynamicProxy<T> {
    public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler handler){
        if (true){
            new BeforeAdvice().execute();
        }
        return (T) Proxy.newProxyInstance(loader,interfaces,handler);
    }
}
