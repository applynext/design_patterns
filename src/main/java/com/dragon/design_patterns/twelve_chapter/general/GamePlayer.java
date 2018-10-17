package com.dragon.design_patterns.twelve_chapter.general;

public class GamePlayer implements IGamePlayer {
    private String name = "";

    //通过构造函数限制谁能创建对象，并同时传递姓名
    public GamePlayer(com.dragon.design_patterns.twelve_chapter.general.IGamePlayer _gamePlayer, String _name) throws Exception {
        if (_gamePlayer == null) {
            throw new Exception("不能创建真实角色");
        } else {
            this.name = _name;
        }
    }

    //进游戏前你肯定要登录吧
    @Override
    public void login(String user, String passwd) {
        System.out.println("登录名为" + user + "的用户" + this.name + "登录成功！");
    }

    //打怪，最期望的就是杀老怪
    @Override
    public void killBoss() {
        System.out.println(this.name + "在打怪！");
    }

    //升级，升级有很多方法，花钱买是一种，做任务也是一种
    @Override
    public void upgrade() {
        System.out.println(this.name + "又升了一级！");
    }
}
