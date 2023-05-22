
package com.mycompany.lab4;

class rectangle
{
    float length;
    float width;
    public rectangle()
    {
        length = 1;
        width = 1;
    }
    float getLength()
    {
        return length; 
    }
    void setLenght(float L)
    {
        if(L > 0 && L < 20)
            length = L;
        else
            System.out.println("Length should be greater than 0 and less than 20!!");
    }
        float getWidth()
    {
        return width; 
    }
    void setWidth(float W)
    {
        if(W > 0 && W < 20)
            width = W;
        else
            System.out.println("Width should be greater than 0 and less than 20!!");
    }
    float getPerimeter()
    {
       return  2*(length + width);
    
    }
    float getArea()
    {
        return width*length;
    
    }
      
}

public class HomeWorkQ2 {
    public static void main(String[] args){
        rectangle R1 = new rectangle();
        R1.setLenght(17);
        R1.setWidth(15);
        System.out.println("The perimeter of the recatngle is : "+R1.getPerimeter());
        System.out.println("The Area of the recatngle is : "+R1.getArea());
    }
    
}
