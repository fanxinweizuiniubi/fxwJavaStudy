package com.fxw.fxwlongtermstudy.util.check;

/**
 * @author fanxinwei
 */
public class TestAAI {

    public static void main(String[] args) {
        int a = 0, b = 0;
        test(++a);
        test(b++);
    }

    public static void test(int move){
        System.out.println(move);
    }

}
