package com.dragon.design_patterns.twelve_chapter.personality;


public class GamePlayerProxy implements com.dragon.design_patterns.twelve_chapter.personality.IGamePlayer,IProxy {
    private IGamePlayer gamePlayer = null;
    //通过构造函数传递要对谁进行代练
    public GamePlayerProxy(IGamePlayer _gamePlayer) {
        this.gamePlayer = _gamePlayer;
    }
    //代练登录
    @Override
    public void login(String user, String passwd) {
        this.gamePlayer.login(user,passwd);
    }

    //代练杀怪
    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    //代练升级
    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
        this.count();
    }

    @Override
    public IGamePlayer getProxy() {
        return this;
    }

    @Override
    public void count() {
        System.out.println("升级一次需要150元");
    }
}
