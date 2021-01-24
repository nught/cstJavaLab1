/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author paterne
 */
public class Quadrilateral {
    Quadrilateral(){
        System.out.println("hello student");
    }
    Quadrilateral(String type){
        System.out.println("type is " + type);
    }
    Quadrilateral(String user, String type){
        System.out.println("user is " + user + " type is " + type);
    }
    double getArea(double side){
        //square
        return side * side;
    }
    double getArea(double length, double width){
        //Rectangle
        return length * width;
    }
    double getArea(double a, double b, double h){
        //trapezium
        return (a + b)*h/2;
    }
}
