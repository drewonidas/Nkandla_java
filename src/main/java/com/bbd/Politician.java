package com.bbd;

/**
 * Created by bbdnet1574 on 2017/01/18.
 */
public class Politician extends Person implements IVisitor {
    public Politician(String name, int age, gender gen, personType type) {
        super(name, age, gen, type);
    }

    public void visit(HomeStead home) {
        if (!super.getType().equals(personType.President))
            throw new RuntimeException("nah nigga!!");
    }
}
