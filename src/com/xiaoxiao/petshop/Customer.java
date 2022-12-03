package com.xiaoxiao.petshop;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;//姓名
    private int arrivalCount = 0;//被服务次数
    private LocalDate lastArrivalTime;//最后一次被服务时间
    private List<Animal> pets;//购买的动物列表

    public Customer(String name) {
        this.name = name;
        pets = new ArrayList<Animal>();
    }

    public void addArrivalCount() {
        this.arrivalCount++;
    }

    public void setLastArrivalTime(LocalDate lastArrivalTime) {
        this.lastArrivalTime = lastArrivalTime;
    }

    public void buy(Animal animal){
        this.pets.add(animal);
    }

    @Override
    public String toString(){
        String petNames = "-";
        if(pets.size()>0){
            for(Animal a : pets){
                petNames += "-"+a.getName();
            }
        }else{
            petNames = "NA";
        }
        return "Customer's Name:"+this.name+";"
                +"Customer's Arrival Count:"+this.arrivalCount+";"
                +"Customer's last Arrival Time:"+this.lastArrivalTime+";"
                +"Customer's Pets:"+petNames+";";
    }

}
