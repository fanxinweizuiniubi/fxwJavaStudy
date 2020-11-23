package com.fxw.fxwlongtermstudy.util.check;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author fanxinwei
 */
public class CheckBoGuanJia {

    public static void main(String[] args) {
        List<Integer> integers = checkBoGuanJia(1);
        System.out.println(Arrays.toString(integers.toArray()));
    }

    private static List<Integer> checkBoGuanJia(Integer amount) {
        List<Integer> list = new ArrayList<>();
        int[] availableArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 30, 50, 100, 200, 300, 500};
        int[] div = {500, 300, 200, 100, 50, 30, 20, 10};
        for (int av : availableArr) {
            if (amount == av) {
                list.add(av);
                return list;
            }
        }
        int n;
        for (int d : div) {
            if (amount > d) {
                n = amount / d;
                for (int i = 0; i < n; i++) {
                    list.add(d);
                }
                amount -= n * d;
            }
        }
        if (amount > 0) {
            list.add(amount);
        }
        return list;
    }

}
