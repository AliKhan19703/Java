
package com.mycompany.lab4;

class Result
{
    int roll;
    String name;
    int[] marks;
    void input(int roll_no,String Name,int[] Marks)
    {
        roll = roll_no;
        name = Name;
        marks = Marks;
    }
    void show()
    {
        System.out.println("Roll no : "+roll);
        System.out.println("Name : "+name);
        System.out.println("Marks of three subjects : "+marks);
    }
    int total()
    {
        int sum = marks[0]+marks[1]+marks[2];
        return sum;
    }
    int average()
    {
        int avg = total()/3;
        return avg;
    }
}

public class HomeWorkQ1 {
    public static void main(String[] args)
    {
        Result student1 = new Result();
        
        student1.input(7, "Ali", new int[]{82,84,92});
        student1.show();
        System.out.println("Total marks : "+student1.total());
        System.out.println("Average marks : "+student1.average());
    }
    
}
