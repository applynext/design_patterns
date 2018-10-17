package com.dragon.design_patterns.eight_chapter.simple_factory;

public class Creator {

    public static <T extends Product> T createProduct(Class<T> c) {
        Product product = null;
        try{
            product = (Product) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            //异常处理
        }
        return (T) product;
    }
}