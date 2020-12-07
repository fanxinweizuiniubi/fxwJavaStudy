package com.fxw.fxwlongtermstudy.util.check;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestRandom {

    public static void main(String[] args) {
        Random random = new Random();
        // random.nextInt(5) return num inside [0,4]
        // if you want a num inside [0,5], you need to plus 1 to the bound
        for (int i = 0; i < 10; i++) {
            int nextInt = random.nextInt(5 + 1);
            System.out.println(nextInt);
        }
    }

}
