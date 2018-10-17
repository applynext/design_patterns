package com.dragon.design_patterns.eleven_chapter.add_director;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        //获取各种车辆模型
        director.getABenzModel().run();
        director.getBBenzModel().run();
        director.getCBMWModel().run();
        director.getDBMWModel().run();
    }
}
