package com.dragon.design_patterns.fourteen_chapter.east_river;

public class BackDoor implements IStrategy {

    @Override
    public void operate() {
        System.out.println("找乔国老，让吴国太给孙权施压！");
    }
}
