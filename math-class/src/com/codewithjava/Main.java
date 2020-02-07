package com.codewithjava;

public class Main {

    public static void main(String[] args) {
        int number = Math.round((15.2F));
        System.out.println(number);
        int score = (int)Math.ceil((15.2F));
        System.out.println(score);
        int wickets = (int)Math.floor((15.2F));
        System.out.println(wickets);
        int run = Math.max(56, 79);
        System.out.println(run);
        int runs = Math.min(56, 79);
        System.out.println(runs);
    }
}
