package com.company;

import java.nio.file.attribute.PosixFileAttributes;

public class PalindromeProblem {
    public static void main(String[] args) {
        PalindromeProblem P = new PalindromeProblem();
        System.out.println(P.solve("madam"));

    }
    public boolean solve(String s){
        int forward = 0;
        int backward = s.length()-1;
        while (forward < backward){
            if(s.charAt(forward) != s.charAt(backward)) {
                return false;
            }

            forward++;
            backward--;

        }
        return true;
    }
}
