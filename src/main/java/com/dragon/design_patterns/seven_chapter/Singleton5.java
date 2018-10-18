package com.dragon.design_patterns.seven_chapter;

//静态内部类方式实现
public class Singleton5 {
    private Singleton5() {}
    public static Singleton5 getInstance() {
        return StaticSingletonHolder.singleton;
    }
    private static class StaticSingletonHolder {
        private static final Singleton5 singleton = new Singleton5();
    }
}
