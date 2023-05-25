package com.mycompany.week5;
import java.util.Scanner;

public class Array 
{

    public static void main(String[] args) 
    {
        Scanner kb = new Scanner(System.in);
        int Marks[];
        Marks = new int[5];
        
        String Names[] = new String[5];
        
        
        for(int i=0; i<5; i++)
        {
            System.out.println("Enter Your Name  : ");
            
            Names[i] = kb.nextLine();
            System.out.println("Enter Your Marks : ");
            Marks[i] = kb.nextInt();
            kb.nextLine();
        }
        
        System.out.println("Name\tMarks ");
        for(int i=0; i<5; i++)
        {
            System.out.println(Names[i]+"\t"+Marks[i]);
        }
        
    }
    
}
