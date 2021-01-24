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
import java.util.Scanner;
public class Trapezium extends Quadrilateral implements Polygon {
    protected int n = 4;
    protected String name = "Trapezium";
    protected int angle = (n-2)*180;
    Trapezium(){
        super();
    }

    @Override
    public String getName() {
        
        return name;
        }

    @Override
    public int getNumbersOfSides() {
        return n;
    }

    @Override
    public int totalAngleSum() {
        return angle; 
    }
    public static void main(String args[]){
        Trapezium trap = new Trapezium();
        Scanner input = new Scanner(System.in);
        System.out.print("enter small base:");
        double a = input.nextDouble();
        System.out.print("enter large base:");
        double b = input.nextDouble();
        System.out.print("enter height:");
        double h = input.nextDouble();
        double area = trap.getArea(a, b, h);
        
        System.out.println("area of "+trap.getName()+" is :" + area
        + "\n" + " number of side is " + trap.getNumbersOfSides() +
                "\n sum of angle is " + trap.totalAngleSum()
        );
        message();
        
    }
    public static void message(){
        System.out.println("thank you");
    }
}
