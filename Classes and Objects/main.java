
package com.mycompany.lab4;

class staticTest
{
    private static int a;
    private int b;
    public staticTest()
    {
      a=0;
      b=0;
    }
    public int getA(){return a;}
    public int getB(){return b;}
    
    public void setA(int i){a=i;}
    public void setB(int j){a=j;}
}


public class main {
    public static void main(String [] args)
    {
        staticTest s1 = new staticTest();
        System.out.println("S1 values :");
        System.out.println("a = "+s1.getA()+" , b = "+s1.getB());
        s1.setA(5);
        s1.setB(3);
        System.out.println("a = "+s1.getA()+" ,b = "+s1.getB());
    }
    
}
