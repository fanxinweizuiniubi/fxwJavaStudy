package com.fxw.fxwlongtermstudy.singleton;

/**
 * 饿汉式单例
 * @author fanxinwei
 */
public class HungryMan {

    private static HungryMan hungryMan = new HungryMan();

    private HungryMan(){}

    public static HungryMan getInstance(){
        return hungryMan;
    }

}
