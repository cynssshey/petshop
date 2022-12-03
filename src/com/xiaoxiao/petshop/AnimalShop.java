package com.xiaoxiao.petshop;

import java.util.List;

public interface AnimalShop {
    String getName();
    void buy(Animal animal) throws InsufficientBalanceException;//进货
    void service(Customer customer);//服务客户
    void open();//开业
    void close();//歇业
    void sale(Customer customer, Animal animal) throws AnimalNotFoundException;//向顾客出售
    double getAccount();//当前小店资金账户余额
    List<Customer> getCustomers();//服务的客户列表
}
