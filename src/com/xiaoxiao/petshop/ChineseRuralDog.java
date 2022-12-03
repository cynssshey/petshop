package com.xiaoxiao.petshop;

public class ChineseRuralDog extends Animal{

    private boolean isVaccineInjected;

    public ChineseRuralDog(String name, int age, int sex, boolean isVaccineInjected) {
        super(name, age, sex);
        this.isVaccineInjected = isVaccineInjected;
    }


    @Override
    public String toString() {
        return "The dog's name is "+this.getName();
    }
}
