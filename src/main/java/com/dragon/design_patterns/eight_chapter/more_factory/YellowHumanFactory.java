package com.dragon.design_patterns.eight_chapter.more_factory;

public class YellowHumanFactory extends AbtractHumanFactory {
    public Human createHuman() {
        return new YellowHuman();
    }
}
