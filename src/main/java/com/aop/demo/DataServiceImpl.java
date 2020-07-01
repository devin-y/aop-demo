package com.aop.demo;

import java.util.UUID;

public class DataServiceImpl implements DataService {
    public String a(int i) {
        String ret = UUID.randomUUID().toString();
        System.out.println("DataServiceImpl func a " + ret);
        return ret;
    }

    public String b(int i) {
        String ret = UUID.randomUUID().toString();
        System.out.println("DataServiceImpl func b " + ret);
        return ret;
    }
}
