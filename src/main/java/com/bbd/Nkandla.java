package com.bbd;

/**
 * Created by bbdnet1574 on 2017/01/18.
 */
public class Nkandla extends HomeStead {
    private SwimmingPool swimmingPool;
    private ChickenRun chickenRun;
    private Ampitheatre ampitheatre;

    public Nkandla(String name, String district, String province, String country) {
        super(name, district, province, country);
    }

    public SwimmingPool getSwimmingPool() {
        return swimmingPool;
    }

    public void setSwimmingPool(SwimmingPool swimmingPool) {
        this.swimmingPool = swimmingPool;
    }

    public ChickenRun getChickenRun() {
        return chickenRun;
    }

    public void setChickenRun(ChickenRun chickenRun) {
        this.chickenRun = chickenRun;
    }

    public Ampitheatre getAmpitheatre() {
        return ampitheatre;
    }

    public void setAmpitheatre(Ampitheatre ampitheatre) {
        this.ampitheatre = ampitheatre;
    }
}
