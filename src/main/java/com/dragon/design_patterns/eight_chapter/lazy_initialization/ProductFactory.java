package com.dragon.design_patterns.eight_chapter.lazy_initialization;

import java.util.HashMap;
import java.util.Map;

public class ProductFactory {
    private static  final Map<String,Product> prMap = new HashMap();
    public static synchronized Product createProduct(String type) {
        Product product = null;
        //如果prMap中已经有这个对象
        if (prMap.containsKey(type)) {
            product = prMap.get(type);
        } else {
            if (type.equals("product1")) {
                product = new ConcreteProduct1();
            } else {
                product = new ConcreteProduct2();
            }
            //同时把缓存对象放到容器
            prMap.put("type", product);
        }
        return product;
    }
}
