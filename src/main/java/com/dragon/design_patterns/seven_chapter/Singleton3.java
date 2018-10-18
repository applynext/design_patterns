package com.dragon.design_patterns.seven_chapter;

//懒汉式加锁之后，线程安全的单例
public class Singleton3 {
    private static Singleton3 singleton = null;

    //限制产生多个对象
    private Singleton3() {
    }

    //通过该方法获得实例对象
    public static synchronized Singleton3 getSingleton() {
        if (singleton == null) {
            singleton = new Singleton3();
        }
        return singleton;
    }
}
