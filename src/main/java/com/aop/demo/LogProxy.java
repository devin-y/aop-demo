package com.aop.demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

public class LogProxy implements InvocationHandler {
    DataService delegate;

    public LogProxy(DataService delegate) {
        this.delegate = delegate;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method.getName() + " is start,params is " + Arrays.toString(args));
        Object returnValue = method.invoke(delegate,args);
        System.out.println(method.getName() + " is finised");
        return returnValue;
    }
}
