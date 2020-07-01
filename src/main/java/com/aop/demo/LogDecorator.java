package com.aop.demo;

public class LogDecorator implements DataService {
    DataService delegate;

    public LogDecorator(DataService delegate) {
        this.delegate = delegate;
    }

    public String a(int i) {
        System.out.println("a is start");
        String value = delegate.a(i);
        System.out.println("a is finish");
        return value;
    }

    public String b(int i) {
        System.out.println("b is start");
        String value = delegate.a(i);
        System.out.println("b is finish");
        return value;
    }
}
