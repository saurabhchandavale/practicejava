package com.practice.questions;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        System.out.println("Enter length");
        Scanner scn = new Scanner(System.in);
        int l = scn.nextInt();
        System.out.println("Enter width");
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        double a = l * w;
        System.out.println("Area of rectangle is " + a);
    }
}
