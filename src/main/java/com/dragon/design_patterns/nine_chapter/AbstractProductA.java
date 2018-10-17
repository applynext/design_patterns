package com.dragon.design_patterns.nine_chapter;

public abstract class AbstractProductA {
    //每个产品共有的方法
    public void shareMethod(){}
    //每个产品相同方法，不同实现
    public abstract void doSomething();
}
