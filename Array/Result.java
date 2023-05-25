package com.mycompany.week5;
import java.util.Scanner;


public class Result 
{
    private int RNo;
    private String Name;
    private int Marks[];
    
    public Result()
    {
        RNo = 0;
        Name = "";
        Marks = new int[3];
    }
    
    public void input()
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter RNo : ");
        RNo = kb.nextInt();
        kb.nextLine();
        System.out.print("Enter Your Name : ");
        Name = kb.nextLine();
        for(int i=0; i<3; i++)
        {
            System.out.print("Enter Subject-"+ (i+1)+" Marks : ");
            Marks[i] = kb.nextInt();
        }
    }
    
    public void Show()
    {
        System.out.println("RESULT OF THE STUDENT \""+Name+"\"");
        System.out.println("=======================================");
        for(int i=0; i<3; i++)
        {
            System.out.println("\tSubject-"+(i+1)+" Marks "+Marks[i]);
        }
        System.out.println("Total   Marks : "+total());
        System.out.println("Average Marks : "+avg());
        
    }
    
    private int total()
    {
        int total=0;
        for(int i=0; i<3; i++)
        {
            total += Marks[i];
        }
        
        return total;
        
    }
    
    private double avg()
    {
        double avg_marks = 0.0;
        avg_marks = total()/3;
        
        return avg_marks;
    }
    
    
}
