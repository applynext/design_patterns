package com.dragon.design_patterns.eight_chapter.more_factory;

public class WhiteHumanFactory extends AbtractHumanFactory {
    public Human createHuman() {
        return new WhiteHuman();
    }
}
