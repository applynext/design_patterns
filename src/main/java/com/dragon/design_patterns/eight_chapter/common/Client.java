package com.dragon.design_patterns.eight_chapter.common;

public class Client {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product = creator.createProduct(ConcreteProduct1.class);
        /**
         * 继续业务处理
         */
    }
}
