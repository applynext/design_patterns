package com.dragon.design_patterns.thirteen_chapter.common;

public class PrototypeClass implements Cloneable {
    @Override
    protected PrototypeClass clone() {
        PrototypeClass prototypeClass = null;
        try {
            prototypeClass = (PrototypeClass)super.clone();
        } catch ( Exception e) {
            e.printStackTrace();
        }
        return prototypeClass;
    }
}
