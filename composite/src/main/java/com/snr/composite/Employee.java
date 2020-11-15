package com.snr.composite;

public abstract class Employee {
    protected String name;

    public Employee(String name){
        this.name = name;
    }

    public int getNumberOfEmployees(){
        return 1;
    }

    public void print(String bulletpoint){
        System.out.println(bulletpoint + name);
    }

}
