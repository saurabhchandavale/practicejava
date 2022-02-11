package com.practice.questions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int n=1;
        System.out.println("Find the factorial of ");
        Scanner scn = new Scanner(System.in);
        int counter = scn.nextInt();
        for(int i=1; i<= counter; i++){
            n=i*n;
        }
        System.out.println("Factorial of " + counter + " is " + n);
    }
}
