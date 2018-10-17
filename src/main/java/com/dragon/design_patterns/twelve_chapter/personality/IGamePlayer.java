package com.dragon.design_patterns.twelve_chapter.personality;

public interface IGamePlayer {
    //登录游戏
    public void login(String user, String passwd);
    //杀怪，网络游戏的主要特色
    public void killBoss();
    //升级
    public void upgrade();
    //每个人都可以找一下自己的代理
    public IGamePlayer getProxy();
}
