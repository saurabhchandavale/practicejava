package com.company;

public class ReverseNumber {
    public static void main(String[] args) {
        ReverseNumber N = new ReverseNumber();
        System.out.println(N.solve(1000));
    }
    public int solve(int num){
        int re;
        int sum = 0;
        while(num > 0) {
            re = num % 10;
            sum = (sum*10) + re;
            num = num / 10;
        }
        return sum;
    }

}
