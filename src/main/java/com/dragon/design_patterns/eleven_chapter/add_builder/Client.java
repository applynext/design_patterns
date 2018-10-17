package com.dragon.design_patterns.eleven_chapter.add_builder;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        /**
         * 客户告诉XX公司，我要这样一个模型，然后XX公司告诉我老大
         * 说要这样一个模型，这样一个顺序，然后我就来制造
         */
        //存放run的顺序
        ArrayList<String> sequence = new ArrayList<String >();
        sequence.add("engine boom");//客户要求run的时候先启动发动机
        sequence.add("start");//启动起来
        sequence.add("stop");//开了一段就停下来
        //要一个奔驰车
        BenzBuilder benzBuilder = new BenzBuilder();
        //我们把这个顺序赋予奔驰车
        benzBuilder.setSequence(sequence);
        //制造出一个奔驰车
        BenzModel benz = (BenzModel) benzBuilder.getCarModel();
        benz.run();

    }
}
