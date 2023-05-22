
package com.mycompany.lab4;

class Circle
{
    public double radius;
    public Circle(double r)
    {
        radius = r;
    }
    public double getRadius()
    {
        return radius;
    }
    public double getArea()
    {
        return Math.PI*radius*radius;
    }
    public double getCircumference()
    {
        return 2*Math.PI*radius;
    }
    public double getDiameter()
    {
        return radius *radius;
    }
}

public class  Circle1{

    public static void main(String[] args) {
        Circle c1 = new Circle(10);
        Circle c2 = new Circle(12);
        System.out.println("The area of the c1 "+c1.getArea());
        System.out.println("The diameter of c2 "+c2.getDiameter());
        c1.radius = 15;
        System.out.println("The area of c1 now "+c1.getArea());
    }
}
