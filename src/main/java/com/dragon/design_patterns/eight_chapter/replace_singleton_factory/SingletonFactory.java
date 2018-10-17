package com.dragon.design_patterns.eight_chapter.replace_singleton_factory;

import java.lang.reflect.Constructor;

public class SingletonFactory {
    private static Singleton singleton;

    static {
        try {
            Class cl = Class.forName(Singleton.class.getName());
            Constructor constructor = cl.getDeclaredConstructor();
            //设置无参构造是可访问的
            constructor.setAccessible(true);
            //产生一个实例
            singleton = (Singleton) constructor.newInstance();
        } catch (Exception e) {
            //异常处理
        }
    }

    public static Singleton getSingleton() {
        return singleton;
    }
}
