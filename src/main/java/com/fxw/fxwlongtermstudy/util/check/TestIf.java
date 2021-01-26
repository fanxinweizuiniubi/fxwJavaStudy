package com.fxw.fxwlongtermstudy.util.check;


import org.apache.commons.lang3.StringUtils;

/**
 * @author fanxinwei
 */
public class TestIf {

    public static void main(String[] args) {
        /*if(2 > 1){
            System.out.println("2 > 1");
        } else if(4 > 3){
            System.out.println("4 > 3");
        }*/
        String str = "";
        if (StringUtils.isNotBlank(str) && str.length()>2){
            System.out.println("测试");
        }
    }

}
