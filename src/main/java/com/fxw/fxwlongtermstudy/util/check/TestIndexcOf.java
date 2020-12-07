package com.fxw.fxwlongtermstudy.util.check;

/**
 * @author fanxinwei
 */
public class TestIndexcOf {

    public static void main(String[] args) {
        String inputStr = "i am robot";
        System.out.println(inputStr.indexOf("or"));
        if(inputStr.indexOf("or") >= 0){
            System.out.println(":)");
        }
    }

}
