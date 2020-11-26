package com.fxw.fxwlongtermstudy.util.check;

public class TestAssert {

    public static void main(String[] args) {
        assert true;
        System.out.println("断言通过！！！");
        assert false : "这里是断言";
        System.out.println("错误的断言过来了！！！");
    }

}
