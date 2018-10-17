package com.dragon.design_patterns.fourteen_chapter.east_river;

public class ZhaoYun {
    public static void main(String[] args) {
        Context context;
        System.out.println("刚到吴国");
        context = new Context(new BackDoor());
        context.operat();

        System.out.println("刘备乐不思蜀时");
        context = new Context(new GivenGreenLight());
        context.operat();

        System.out.println("孙权追兵");
        context = new Context(new BlockEnemy());
        context.operat();

    }
}
