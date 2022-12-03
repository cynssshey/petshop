package com.xiaoxiao.petshop;

public class AnimalNotFoundException extends Exception{

    public AnimalNotFoundException() {
        super("已无可出售的宠物");
    }
}
