package com.codewithjava;

public class Main {

    public static void main(String[] args) {
	int score = 36;
	boolean won = score > 54 && 46 < score;
        System.out.println(won);

     boolean highScore = true;
     boolean highRate = false;
        System.out.println(highScore || highRate);
    }
}
