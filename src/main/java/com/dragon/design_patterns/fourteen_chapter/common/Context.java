package com.dragon.design_patterns.fourteen_chapter.common;

public class Context {
    //抽象策略
    Strategy strategy = null;
    //构造函数设置具体策略
    public Context(Strategy _strategy) {
        this.strategy = _strategy;
    }
    //封装后的策略方法
    public void doAnyThing() {
        this.strategy.doSomething();
    }
}
