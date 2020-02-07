package com.codewithjava;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
   String good = hello("dhoni", 39);
        System.out.println(good);
    }
    public static  String hello (String name, Integer age){
        return "My name is " + name+ " " + age + " years old";

}
}