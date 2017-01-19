package com.bbd;

/**
 * Created by bbdnet1574 on 2017/01/18.
 */
public abstract class Person {
    private String name;
    private int age;
    private gender gen;
    private personType type;

    public Person(String name, int age, gender gen, personType type) {
        this.name = name;
        this.age = age;
        this.gen = gen;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public gender getGen() {
        return gen;
    }

    public void setGen(gender gen) {
        this.gen = gen;
    }

    public personType getType() {
        return type;
    }

    public void setType(personType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gen=" + gen +
                ", type=" + type +
                '}';
    }
}
