package com.fxw.fxwlongtermstudy.util.compare;

import java.math.BigDecimal;

/**
 * @author fanxinwei
 */
public class CompareBigDecimal {

    public static void main(String[] args) {
        int integer = 6000;
        BigDecimal bigDecimal = new BigDecimal(6000);
        if(BigDecimal.valueOf(integer).compareTo(bigDecimal) > 0){
            System.out.println("大了");
        }
        /*BigDecimal big = new BigDecimal(8);
        BigDecimal small = new BigDecimal(6);
        System.out.println(big.subtract(small));*/
    }

}
