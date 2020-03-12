package com.codewithjava;

import org.w3c.dom.Text;

public class Main {

    public static void main(String[] args) {
	var box = new TextBox();
	var box2 = new TextBox();
        System.out.println(box.hashCode());
        System.out.println(box2.equals(box));
        System.out.println(box.toString());
    }

}
