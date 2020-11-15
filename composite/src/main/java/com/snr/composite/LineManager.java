package com.snr.composite;

import java.util.ArrayList;
import java.util.List;

public class LineManager extends Employee{

    private List<Employee> employees = new ArrayList<>();
    private String department;

    public LineManager(String name, String department) {
        super(name);
        this.department = department;
    }
    @Override
    public int getNumberOfEmployees(){
        int count = 1;
        for(Employee coworker : employees){
            count += coworker.getNumberOfEmployees();
        }
        return count;
    }

    @Override
    public void print(String bulletpoint){
        System.out.println(bulletpoint + "Linemanager " + super.name + " (" + getDepartment() + ")");

        for(Employee coworker : employees){
            coworker.print("\t" + bulletpoint);
        }
    }

    public void add(Employee employee){
        employees.add(employee);
    }

    public void remove(Employee employee){
        employees.remove(employee);
    }

    public Employee getEmployee(int index){
        return employees.get(index);
    }

    public String getDepartment(){
        return this.department;
    }

}
