package com.example.charles.retrofitapp.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by charles on 9/19/17.
 * 动态代理类的ｈａｎｄｌｅｒ
 */

public class MyInvocationHandler implements InvocationHandler {

    private Object object = null;

    public MyInvocationHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        try{
            return method.invoke(this.object,objects);
        }catch (InvocationTargetException e){
            throw e.getCause();
        }
    }
}
