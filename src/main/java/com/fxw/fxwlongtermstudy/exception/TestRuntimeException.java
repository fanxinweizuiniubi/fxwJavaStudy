package com.fxw.fxwlongtermstudy.exception;

/**
 * @author fanxinwei
 */
public class TestRuntimeException {

    public static void main(String[] args) {
        int a = 3, b = 5;
        if(b > a){
            throw new RuntimeException("测试运行时异常");
        }
        System.out.println("到不了这里");
    }

}
