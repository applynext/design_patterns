package com.dragon.design_patterns.fourteen_chapter.east_river;

public class Context {;
    //构造函数，你要使用那条妙计
    private IStrategy strategy;
    public Context(IStrategy _strategy) {
        this.strategy = _strategy;
    }
    //使用计谋
    public void operat() {
        this.strategy.operate();
    }
}
