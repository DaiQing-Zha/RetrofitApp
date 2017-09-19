package com.example.charles.retrofitapp;

import com.example.charles.retrofitapp.dynamic_proxy.DynamicProxy;
import com.example.charles.retrofitapp.dynamic_proxy.ISubject;
import com.example.charles.retrofitapp.dynamic_proxy.MyInvocationHandler;
import com.example.charles.retrofitapp.dynamic_proxy.RealSubject;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testDynamicProxy(){
        //定义一个主题
        RealSubject realSubject = new RealSubject();
        //定义一个主题handler
        InvocationHandler handler = new MyInvocationHandler(realSubject);
        //获得一个代理类
        ISubject proxy = DynamicProxy.newProxyInstance(realSubject.getClass().getClassLoader()
                ,realSubject.getClass().getInterfaces(),handler);
        proxy.doSomething();
    }
}