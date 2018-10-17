package com.dragon.design_patterns.twelve_chapter.personality;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
    public static void main(String[] args) {
        //再定义一个游戏角色
        com.dragon.design_patterns.twelve_chapter.personality.IGamePlayer player = new com.dragon.design_patterns.twelve_chapter.personality.GamePlayer("张三");
        //再定义一个代练者
        com.dragon.design_patterns.twelve_chapter.personality.IGamePlayer proxy = player.getProxy();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
        //开始打游戏，记下时间戳
        System.out.println("开始时间是" + sdf.format(new Date()));
        proxy.login("zhangsan","passwd");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("结束时间是"+sdf.format(new Date()));
    }
}
