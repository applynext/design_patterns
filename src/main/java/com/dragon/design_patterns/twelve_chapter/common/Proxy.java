package com.dragon.design_patterns.twelve_chapter.common;

public class Proxy implements Subject {
    //要实现那个代理类
    private Subject subject = null;
    //默认被代理者
    public Proxy() {
        this.subject = new Proxy();
    }
    //通过构造函数传递被代理者
    public Proxy(Subject...subjects) {

    }
    //实现接口中的方法
    @Override
    public void request() {
        this.before();
        this.subject.request();
        this.after();
    }
    //预处理
    public void before() {

    }
    //善后处理
    public void after() {

    }
}
