package com.dragon.design_patterns.nine_chapter;

public class Creator1 extends AbstractCreator {

    //只生产等级为1的A产品
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    //只生产等级为1的B产品
    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
