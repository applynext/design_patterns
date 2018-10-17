package com.dragon.design_patterns.thirteen_chapter.shallow_deep_copy;

public class Client2 {
    public  static void main(String[] args) {
        //产生一个对象
        Thing2 thing = new Thing2();
        //设置一个值
        thing.setValue("张三");
        //拷贝一个对象
        Thing2 cloneThing = thing.clone();
        cloneThing.setValue("李四");
        System.out.println(thing.getValue());
    }
}
