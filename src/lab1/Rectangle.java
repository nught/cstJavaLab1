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
public class Rectangle implements Polygon{
    int n = 4;
    String name = "rectangle"; 
    
    Rectangle(String user, String type){
        Quadrilateral quad = new Quadrilateral(user, type);
        //quad.getArea(length, width);
    }
    
    Rectangle(){
        
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
        return (n-2)*180;
    }
    public static void main(String args[]){
        Rectangle rec = new Rectangle("student"," rectangle");
    }
}
