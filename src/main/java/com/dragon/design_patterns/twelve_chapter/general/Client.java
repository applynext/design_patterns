package com.dragon.design_patterns.twelve_chapter.general;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
    public static void main(String[] args) {
        //然后再定义一个红练者
        IGamePlayer proxy = new GamePlayerProxy("张三");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
        //开始打游戏，记下时间戳
        System.out.println("开始时间是" + sdf.format(new Date()));
        proxy.login("zhangsan","passwd");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("结束时间是"+sdf.format(new Date()));
    }
}
