package com.dragon.design_patterns.ten_chapter;

public class HummerH1Model extends HummerModel {
    private boolean alarmFlag = true; //要按喇叭
    //汽车发动
    @Override
    public void start() {
        System.out.println("悍马H1发动...");
    }

    //停车
    @Override
    public void stop() {
        System.out.println("悍马H1停车...");
    }

    //H1型号的悍马车鸣笛
    @Override
    public void alarm() {
        System.out.println("悍马H1鸣笛...");
    }

    @Override
    public void engineBoom() {
        System.out.println("悍马H1引擎声音是这样的...");
    }

    //要不要按喇叭，由客户来决定
    @Override
    protected boolean isAlarm() {
        return this.alarmFlag;
    }

    public void setAlarm(boolean alarmFlag) {
        this.alarmFlag = alarmFlag;
    }
}
