package com.dragon.design_patterns.eleven_chapter.common;

public class ConcreteProduct extends Builder {
    private Product product = new Product();

    //设置产品零件
    @Override
    public void setPart() {
        /**
         * 产品类内的逻辑
         */
    }

    //组建一个产品
    @Override
    public Product buildProduct() {
        return this.product;
    }
}
