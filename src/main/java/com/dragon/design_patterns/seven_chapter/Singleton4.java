package com.dragon.design_patterns.seven_chapter;

//懒汉式加锁之后，性能有优化，线程安全的单例
public class Singleton4 {
    private static Singleton4 singleton = null;

    //限制产生多个对象
    private Singleton4() {
    }

    //通过该方法获得实例对象
    public static Singleton4 getSingleton() {
        /**
         * 如果第一个线程获取到了单例的实例对象
         * 后面的线程在获取实例对象的时候不需要进入到同步代码块中了
         */
        if(singleton == null) {
            synchronized (Singleton4.class) {
                //同步代码块用的锁是单例字节码文件对象，具只能是用这个锁
                if (singleton == null) {
                    singleton = new Singleton4();
                }
            }
        }
        return singleton;
    }
}
