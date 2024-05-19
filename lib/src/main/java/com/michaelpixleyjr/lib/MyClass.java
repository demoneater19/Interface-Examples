package com.michaelpixleyjr.lib;

public class MyClass {

    public static void main(String[] args){

        //Calculate the Area of:
            //Circle
            //Rectangle

        Circle c = new Circle(5.0);
        Rectangle r = new Rectangle(4.0, 6.0);

        System.out.println("Circle Area: " + c.calculateArea());
        System.out.println("Circle Perimeter: " + c.calculatePerimeter());
        System.out.println("Rectangle Area: " + r.calculateArea());
        System.out.println("Rectangle Perimeter: " + r.calculatePerimeter());
    }
}