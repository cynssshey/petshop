package com.xiaoxiao.petshop;

public abstract class Animal {
    private String name;//姓名
    private int age;//年龄
    private int sex;//性别 0或1
    private double purchasePrice;//进价
    private double salePrice;//卖价

    public Animal(String name, int age, int sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSex() {
        return sex;
    }

    public abstract String toString();
}
