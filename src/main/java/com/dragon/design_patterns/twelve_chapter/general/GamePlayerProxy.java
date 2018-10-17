package com.dragon.design_patterns.twelve_chapter.general;

public class GamePlayerProxy implements IGamePlayer {
    private IGamePlayer gamePlayer = null;
    //通过构造函数传递要对谁进行代练
    public GamePlayerProxy(String name) {
        try {
            gamePlayer = (IGamePlayer) new GamePlayer(this,name);
        } catch (Exception e) {
                //TODO异常处理
        }
    }
    //代练登录
    @Override
    public void login(String user, String passwd) {
        this.gamePlayer.login(user,passwd);
    }

    //代练杀怪
    @Override
    public void killBoss() {
        this.killBoss();
    }

    //代练升级
    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
    }
}
