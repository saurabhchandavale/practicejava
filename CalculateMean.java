package com.practice.questions;
import java.util.Scanner;
public class CalculateMean {
    public static void main(String[] args) {
        int sum = 0;
        int inputNum;
        int counter;
        float mean;
        Scanner num = new Scanner(System.in);
        System.out.println("Enter total numbers of terms whose mean you want to calculate");
        counter = num.nextInt();
        System.out.println("Please enter " + counter + " numbers.");
        for (int x = 1; x<=counter; x++) {
            inputNum =num.nextInt();
            sum = sum + inputNum;
        }
        mean = sum / counter;
        System.out.println("The mean of the " + counter + " numbers you entered is " + mean);
    }
}
