package com.xiaoxiao.petshop;

public class InsufficientBalanceException extends Exception{

    public InsufficientBalanceException() {
        super("小店资金账户余额不足");
    }
}
