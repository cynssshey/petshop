package com.xiaoxiao.petshop;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MyAnimalShop implements AnimalShop{
    private String name;
    private double account;
    private List<Animal> pets;
    private List<Customer> customers;
    private boolean isOpen;

    public boolean isOpen() {
        return isOpen;
    }

    public MyAnimalShop(String name, double account) {
        this.name = name;
        this.account = account;
        this.pets = new ArrayList<Animal>();
        this.customers = new ArrayList<Customer>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void buy(Animal animal) throws InsufficientBalanceException {
        if(account<animal.getPurchasePrice()){
            throw new InsufficientBalanceException();
        }else{
            account = account - animal.getPurchasePrice();
            this.pets.add(animal);
        }

    }

    @Override
    public void service(Customer customer) {
        customer.addArrivalCount();
        customer.setLastArrivalTime(LocalDate.now());
        this.customers.add(customer);
    }

    @Override
    public void open() {
        isOpen = true;
    }

    @Override
    public void close() {
        this.isOpen = false;
    }

    @Override
    public void sale(Customer customer, Animal animal) throws AnimalNotFoundException {
        if(this.pets.size() ==0){
            throw new AnimalNotFoundException();
        }else{
            pets.remove(animal);
            customer.buy(animal);
            this.account += animal.getSalePrice();
        }

    }

    public double getAccount() {
        return account;
    }

    @Override
    public List<Customer> getCustomers() {
        return this.customers;
    }
}
