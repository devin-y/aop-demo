package com.aop.demo;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Arrays;

public class LogInterceptor implements MethodInterceptor {
    private DataServiceImpl2 delegate;

    public LogInterceptor(DataServiceImpl2 delegate) {
        this.delegate = delegate;
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println(method.getName() + " is start,params is " + Arrays.toString(objects));
        Object returnValue = method.invoke(delegate,objects);
        System.out.println(method.getName() + " is finised");
        return returnValue;
    }
}