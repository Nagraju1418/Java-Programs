package com.demo;

import java.util.Scanner;

public class ArithIO {
    public int add(int a, int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
    public int mul(int a, int b){
        return a*b;
    }
    public int div(int a, int b){
        return a/b;
    }
    public static void main(String[] args){
        ArithIO art = new ArithIO();
        System.out.println("Enter Input Values: ");
        Scanner x = new Scanner(System.in);
        Scanner y = new Scanner(System.in);
        int a = x.nextInt();
        int b = y.nextInt();
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("Addition of a,b: "+art.add(a,b));
        System.out.println("Subtraction of a,b: "+art.sub(a,b));
        System.out.println("Multiplication of a,b: "+art.mul(a,b));
        System.out.println("Division of a,b: "+art.div(a,b));

    }

}


