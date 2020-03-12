package com.codewithjava;

public class Employee {
    public int salary;
    public int rate;


    public int calculateWage(int extraHours){
        return  salary + ( rate  * extraHours);
    }
}
