package com.dragon.design_patterns.fourteen_chapter.common;

public class ConcreteStrategy1 implements Strategy {

    @Override
    public void doSomething() {
        System.out.println("具体策略1的运算法则");
    }
}
