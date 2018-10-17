package com.dragon.design_patterns.eleven_chapter.add_director;

import java.util.ArrayList;

public class Director {
    private ArrayList<String> sequence = new ArrayList<>();
    private  BenzBuilder benzBuilder = new BenzBuilder();
    private BMWBuilder bmwBuilder = new BMWBuilder();

    /**
     * A类型的奔驰车模型，先start，然后stop，其它什么引擎、喇叭一概没有
     */
    public BenzModel getABenzModel() {
        //清理场景
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("stop");
        //按照顺序返回一个奔驰车
        this.benzBuilder.setSequence(this.sequence);
        return (BenzModel) this.benzBuilder.getCarModel();
    }

    /**
     * B类型的奔驰车模型，先engine boom，然后start，然后stop，没有喇叭
     */
    public BenzModel getBBenzModel() {
        //清理场景
        this.sequence.clear();
        this.sequence.add("engine boom");
        this.sequence.add("start");
        this.sequence.add("stop");
        //按照顺序返回一个奔驰车
        this.benzBuilder.setSequence(this.sequence);
        return (BenzModel) this.benzBuilder.getCarModel();
    }

    /**
     * C类型的宝马车模型，先alarm，然后start，然后stop，没有喇叭
     */
    public BMWModel getCBMWModel() {
        //清理场景
        this.sequence.clear();
        this.sequence.add("alarm");
        this.sequence.add("start");
        this.sequence.add("stop");
        //按照顺序返回宝马车
        this.bmwBuilder.setSequence(this.sequence);
        return (BMWModel) this.bmwBuilder.getCarModel();
    }

    /**
     * D类型的宝马车模型，只有start
     */
    public BMWModel getDBMWModel() {
        //清理场景
        this.sequence.clear();
        this.sequence.add("start");
        //按照顺序返回宝马车
        this.bmwBuilder.setSequence(this.sequence);
        return (BMWModel) this.bmwBuilder.getCarModel();
    }
}
