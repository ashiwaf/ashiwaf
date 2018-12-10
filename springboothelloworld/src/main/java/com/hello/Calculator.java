package com.hello;


import java.util.Map;

public class Calculator {
    private Integer val1;
    private Integer val2;

    Map<String,Integer> Add(Map<String,Integer> obj){

        int result = val1 + val2;
        obj.put("result", result);
        return obj;
    }
}
