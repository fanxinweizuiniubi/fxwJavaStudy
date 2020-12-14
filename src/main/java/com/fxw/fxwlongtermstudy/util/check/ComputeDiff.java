package com.fxw.fxwlongtermstudy.util.check;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author fanxinwei
 */
public class ComputeDiff {

    public static void main(String[] args) {
        List<Integer> targetList = Arrays.asList(4,5,2);
        Collections.sort(targetList);
        int curSignDay = 1;
        int leftDay2Gift = 0;
        int curNext = 0;
        for(Integer in : targetList){
            if(in > curSignDay) {
                curNext = in;
                break;
            }
        }
        int awardDay = 0;
        if(curSignDay >= targetList.get(targetList.size()-1)){
            leftDay2Gift = 7 - curSignDay + targetList.get(0);
            awardDay = targetList.get(0);
        } else {
            leftDay2Gift = curNext - curSignDay;
            awardDay = curNext;
        }
        System.out.println(leftDay2Gift);
        System.out.println("奖励日：" +awardDay);
    }

}
