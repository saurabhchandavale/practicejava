package com.practice.questions;

public class Compare {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        int c = 7;
        if(a > b) {
            if (a > c) {
                System.out.println(" Highest Value " + a);
            }else{
                System.out.println(" Highest Value " + c);
            }
        }else if(b > c){
            System.out.println(" Highest Value " + b);
        }else{
            System.out.println(" Highest Value " + c);
        }
    }
}
