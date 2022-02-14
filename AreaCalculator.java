package com.practice.questions;
import java.util.Scanner;
public class AreaCalculator {
    float l, b, h, r, ba, s, c;
    float result = 0f;
    float pi = 3.14f;
    int var;

    public void options(){
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the object of which area is to be calculated " +
                "\n1 : square \n2 : rectangle \n3 : triangle \n4 : circle" +
                " \n5 : trapezoid \n6 : repeat \n7 : exit");

        var = a.nextInt();
        Area a1 = new Area();
        if(var == 1) {
            System.out.println("Enter the side of square ");
            s = a.nextFloat();
            a1.square(s);
        }else if(var == 2) {
            System.out.println(" Enter the length of rectangle");
            l = a.nextFloat();
            System.out.println(" Enter the breadth of rectangle");
            b = a.nextFloat();
            a1.rectangle(l, b);
        }else if(var == 3){
            System.out.println("Enter the height of triangle");
            h = a.nextFloat();
            System.out.println("Enter the base of triangle");
            ba = a.nextFloat();
            a1.triangle(h, ba);
        }
        else if( var == 4){
            System.out.println("Enter the radius of circle");
            r = a.nextFloat();
            a1.circle(r);
        }else if(var == 5){
            System.out.println("Enter A side of trapezoid");
            b = a.nextFloat();
            System.out.println("Enter B side of trapezoid");
            c = a.nextFloat();
            System.out.println("Enter height of trapezoid");
            h = a.nextFloat();
            a1.trapezoid(b, c, h);
        }
    }
    class Area{
        public void square(float s){
            float result = 0f;
            result = s * s;
            System.out.println("The area of square is " + result);
        }
        public void rectangle(float l, float b){
            float result = 0f;
            result = l * b;
            System.out.println("The area of rectangle is " + result);
        }
        public void triangle(float h, float ba){
            float result = 0f;
            result = 0.5f * h * ba;
            System.out.println("The area of triangle is " + result);
        }
        public void circle(float f){
            float result = 0f;
            result = 3.14f * (r * r);
            System.out.println("Area of circle is " + result);
        }
        public void trapezoid(float b, float c, float h){
            float result = 0f;
            result = (((b + c) / 2) * h);
            System.out.println("Area of trapezoid is " + result);
        }
    }

    public static void main(String[] args) {
        AreaCalculator ar = new AreaCalculator();
        ar.options();
    }
}
