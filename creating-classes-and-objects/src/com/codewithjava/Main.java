package com.codewithjava;

public class Main {

    public static void main(String[] args) {
	  var textBox1  = new  TextBox();
	  textBox1.setText("box 45");
        System.out.println(textBox1.text.toUpperCase());

      var textBox2 = new TextBox();
      textBox2.setText("box 44");
        System.out.println(textBox2.text.toLowerCase());
    }

}

