package com.aop.demo;

import java.util.HashMap;
import java.util.Map;

public class CacheDecorator implements DataService {
    private Map<String,String> cache = new HashMap();

    private DataService delegate;

    public CacheDecorator(DataService delegate) {
        this.delegate = delegate;
    }

    public String a(int i) {
        String cacheValue = cache.get("a");
        if(cacheValue == null){
            String realValue = delegate.a(i);
            cache.put("a",realValue);
            return realValue;
        } else {
            return cacheValue;
        }
    }

    public String b(int i) {
        return null;
    }
}
