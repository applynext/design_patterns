package com.dragon.design_patterns.seven_chapter;

//线程不安全的单例
public class Singleton2 {
    private static  Singleton2 singleton = null;
    //限制产生多个对象
    private Singleton2() {}
    //通过该方法获得实例对象
    public static Singleton2 getSingleton() {
        if (singleton == null) {
            singleton = new Singleton2();
        }
            return singleton;
    }
}
