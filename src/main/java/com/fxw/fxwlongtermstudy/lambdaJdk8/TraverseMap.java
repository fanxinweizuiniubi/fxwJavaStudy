package com.fxw.fxwlongtermstudy.lambdaJdk8;

import java.util.HashMap;
import java.util.Map;

public class TraverseMap {

    public static void main(String[] args) {
        Map<String,Object> map = new HashMap<>();
        map.put("name","fxw");
        map.put("age","22");
        map.forEach((k,v) -> {
            System.out.println(k + ":" + v);
        });
    }

}
