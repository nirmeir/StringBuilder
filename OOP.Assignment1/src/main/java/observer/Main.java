package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        My_string usd = new My_string();
        usd.append("to be or not to be");
        System.out.println(usd);
        usd.replace(3, 5, "eat");
        System.out.println(usd);
        usd.replace(17, 19, "eat");
        System.out.println(usd);
        usd.reverse();
        System.out.println(usd);
        System.out.println();
        usd.undo();
        System.out.println(usd);
        usd.undo();
        System.out.println(usd);
        usd.undo();
        System.out.println(usd);


    }
}
