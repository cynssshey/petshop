package com.xiaoxiao.petshop;

public class Cat extends Animal{

    public Cat(String name, int age, int sex) {
        super(name, age, sex);
    }

    @Override
    public String toString() {
        return "The Cat's name is "+this.getName();
    }
}
