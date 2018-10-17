package com.dragon.design_patterns.twelve_chapter.force;

public class GamePlayer implements com.dragon.design_patterns.twelve_chapter.force.IGamePlayer {
    private String name = "";
    //我的代理是谁
    private IGamePlayer proxy = null;
    public GamePlayer(String _name) {
            this.name = _name;
    }

    //进游戏前你肯定要登录吧
    @Override
    public void login(String user, String passwd) {
        if (this.isProxy()) {
            System.out.println("登录名为" + user + "的用户" + this.name + "登录成功！");
        } else {
            System.out.println("请使用代理访问");
        }
    }

    //打怪，最期望的就是杀老怪
    @Override
    public void killBoss() {
        if (this.isProxy()) {
            System.out.println(this.name + "在打怪！");
        } else {
            System.out.println("请使用代理访问");
        }
    }

    //升级，升级有很多方法，花钱买是一种，做任务也是一种
    @Override
    public void upgrade() {
        if (this.isProxy()) {
            System.out.println(this.name + "又升了一级！");
        } else {
            System.out.println("请使用代理访问");
        }

    }

    @Override
    public IGamePlayer getProxy() {
        this.proxy = new GamePlayerProxy(this);
        return this.proxy;
    }

    private boolean isProxy() {
        if (this.proxy == null) {
            return false;
        } else {
            return true;
        }
    }
}
