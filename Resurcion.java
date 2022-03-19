package com.company;

public class Resurcion {
    public static void main(String[] args) {
        System.out.println(recursiveFactorial(6));
    }
    public static int recursiveFactorial(int num){
        if(num == 0){
            return  1;
        }
        return num * recursiveFactorial(num - 1);
    }
}
