package com.fxw.fxwlongtermstudy.util.convert;

import java.math.BigDecimal;

/**
 * @author fanxinwei
 */
public class BigDecimal2Integer {

    public static void main(String[] args) {
        BigDecimal bd = new BigDecimal("1.3412321333123");
        int intB = bd.intValue();
        BigDecimal newBd = bd.setScale(0, BigDecimal.ROUND_DOWN);
        System.out.println();
    }

}
