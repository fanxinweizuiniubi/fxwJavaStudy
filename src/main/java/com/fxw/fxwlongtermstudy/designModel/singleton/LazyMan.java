package com.fxw.fxwlongtermstudy.designModel.singleton;

/**
 * 懒汉式单例
 * @author fanxinwei
 */
public class LazyMan {

    private volatile static LazyMan lazyMan;

    public static LazyMan getInstance(){
        if(lazyMan == null){
            synchronized (LazyMan.class){
                if(lazyMan == null){
                    return new LazyMan();
                }
            }
        }
        return lazyMan;
    }


}
