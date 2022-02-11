package com.practice.questions;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Which year you want to check ?");
        Scanner scn = new Scanner(System.in);
        int counter = scn.nextInt();
        boolean leap = false;
        if (counter % 4 == 0) {
            if (counter % 100 == 0) {
                if (counter % 400 == 0) {
                    leap = true;
                } else {
                    leap = false;
                }
            } else {
                leap = true;
            }
        } else {
            leap = false;
        }
        if(leap){
            System.out.println(counter + " is a leap year");
        }else{
            System.out.println(counter + " is not a leap year");
        }
    }
}

