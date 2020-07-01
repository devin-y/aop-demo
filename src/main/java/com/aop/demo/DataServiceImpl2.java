package com.aop.demo;

import java.util.UUID;

public class DataServiceImpl2 {
    public String a(int i) {
        String ret = UUID.randomUUID().toString();
        System.out.println("DataServiceImpl2 func a " + ret);
        return ret;
    }

    public String b(int i) {
        String ret = UUID.randomUUID().toString();
        System.out.println("DataServiceImpl2 func b " + ret);
        return ret;
    }
}
