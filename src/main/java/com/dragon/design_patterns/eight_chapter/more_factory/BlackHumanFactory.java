package com.dragon.design_patterns.eight_chapter.more_factory;

public class BlackHumanFactory extends AbtractHumanFactory {
    public Human createHuman() {
        return new BlackHuman();
    }
}
