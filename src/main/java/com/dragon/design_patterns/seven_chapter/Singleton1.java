package com.dragon.design_patterns.seven_chapter;

//线程安全的单例
public class Singleton1 {
    private static final Singleton1 singleton = new Singleton1();
    //限制产生多个对象
    private Singleton1() {}
    //通过该方法获得实例对象
    public static Singleton1 getSingleton() {
        return singleton;
    }
    //类中的其它方法，尽量是static
    public static void doSomething(){

    }
}
