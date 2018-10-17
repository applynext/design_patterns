package com.dragon.design_patterns.eight_chapter.simple_factory;

public class Client {
    public static void main(String[] args) {
        Creator creator = new Creator();
        Product product = creator.createProduct(ConcreteProduct1.class);
        /**
         * 继续业务处理
         */
    }
}