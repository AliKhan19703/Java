
package com.mycompany.lab4;

class A
{
    private int value ;
    public int getValue(){return value;}
    public void setValue(int i){value = i;}
}
public class B 
{
    public static void main(String [] args)
    {
        A v = new A();
        v.setValue(15);
        System.out.println("The value is "+v.getValue());
    }
}
