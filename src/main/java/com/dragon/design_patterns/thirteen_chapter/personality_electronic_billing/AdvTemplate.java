package com.dragon.design_patterns.thirteen_chapter.personality_electronic_billing;

public class AdvTemplate {
    private String advSubject = "XX银行国庆信用卡抽奖活动";
    private String advContext = "国庆抽奖活动通知，只要刷卡就送人一百万！...";

    //取得广告信的名称
    public String getAdvSubject() {
        return this.advSubject;
    }

    //取得广告信的内容
    public String getAdvContext() {
        return this.advContext;
    }
}
