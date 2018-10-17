package com.dragon.design_patterns.twelve_chapter.dynamic_general;

public class RealSubject implements Subject {

    //业务操作
    @Override
    public void doSomething() {
        System.out.println("do something!");
    }
}
