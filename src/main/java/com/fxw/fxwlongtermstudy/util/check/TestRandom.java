package com.fxw.fxwlongtermstudy.util.check;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestRandom {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("干饭");
        list.add("稀粥");
        list.add("炒菜");
        list.add("面条");
        list.add("火锅");
        list.add("冒菜");
        list.add("麻辣烫");
        list.add("烧烤");
        Random random = new Random();
        for(int i = 0;i < 10;i++) {
            int n = random.nextInt(list.size());
            String food = list.get(n);
            System.out.println(food);
        }
    }

}
