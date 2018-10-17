package com.dragon.design_patterns.thirteen_chapter.shallow_deep_copy;

import java.util.ArrayList;

public class Thing1 implements Cloneable {
    //定义一个私有变量
    private ArrayList<String> arrayList = new ArrayList<String>();

    @Override
    protected Thing1 clone() {
        Thing1 thing = null;
        try {
            thing = (Thing1) super.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return thing;
    }
    //设置ArrayList的值
    public void setValue(String value) {
        this.arrayList.add(value);
    }
    //取得arrayList的值

    public ArrayList<String> getValue() {
        return this.arrayList;
    }
}
