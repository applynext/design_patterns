package com.dragon.design_patterns.twelve_chapter.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
    public static void main(String[] args) {
        //定义一个玩家
        IGamePlayer player = (IGamePlayer) new GamePlayer("张三");
        //定义一个handler
        InvocationHandler handler = new GamePlayIH(player);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
        //开始打游戏，记下时间戳
        System.out.println("开始时间是" + sdf.format(new Date()));
        //获得类的ClassLoader
        ClassLoader loader = player.getClass().getClassLoader();
        //动态产生一个代理
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(loader, new Class[]{
                IGamePlayer.class
        }, handler);

        proxy.login("zhangsan", "passwd");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("结束时间是" + sdf.format(new Date()));
    }
}
