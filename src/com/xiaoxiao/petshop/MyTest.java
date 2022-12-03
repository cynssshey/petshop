package com.xiaoxiao.petshop;

import java.util.ArrayList;
import java.util.List;

public class MyTest {
    public static void main(String[] args) throws InsufficientBalanceException, AnimalNotFoundException {
        //初始化一家小店叫"XiaoXiao-Pets-Shop"，初始资金10000元
        double intAccount = 10000;
        AnimalShop myShop = new MyAnimalShop("XiaoXiao-Pets-Shop", intAccount);
        myShop.open();//开业

        //小店进货
        Cat cat1 = new Cat("cat1", 2, 1);//一只小猫叫cat1
        cat1.setPurchasePrice(150);//买入价150
        cat1.setSalePrice(200);//售价200
        myShop.buy(cat1);//小店以150元价格买入这只小猫

        ChineseRuralDog dog1 = new ChineseRuralDog("dog1", 2, 1, true);//一只小狗叫dog1
        dog1.setPurchasePrice(60);//买入价60
        dog1.setSalePrice(100);//售价100
        myShop.buy(dog1);//小店以100元价格买入这只小狗

        ChineseRuralDog dog2 = new ChineseRuralDog("dog2", 2, 1, true);//一只小狗叫dog2
        dog2.setPurchasePrice(60);//买入价60
        dog2.setSalePrice(100);//售价100
        myShop.buy(dog2);//小店以100元价格买入这只小狗

        //客户1光临，买了cat1和dog1
        Customer customer1 = new Customer("customer1");//一位顾客叫customer1
        myShop.service(customer1);//小店服务这位顾客
        myShop.sale(customer1, cat1);//小店将小猫以200元的价格卖给customer1顾客
        myShop.sale(customer1, dog1);//小店将小狗以100元的价格卖给customer1顾客


        //客户2光临，买了dog2
        Customer customer2 = new Customer("customer2");//一位顾客叫customer2
        myShop.service(customer2);//小店服务这位顾客
        myShop.sale(customer2, dog2);//小店将小狗以100元的价格卖给customer2顾客

        //客户3光临，啥也没买
        Customer customer3 = new Customer("customer3");//一位顾客叫customer3
        myShop.service(customer3);//小店服务这位顾客

        //小店经营情况
        System.out.println(myShop.getName()+"小店当前资金账户余额:"+myShop.getAccount());

        List<Customer> list = myShop.getCustomers();
        for(int i=0; i<list.size(); i++){
            System.out.println("服务的客户"+(i+1)+":"+list.get(i).toString());
        }


    }
}
