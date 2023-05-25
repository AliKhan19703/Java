
package com.mycompany.week5;
import javax.swing.*;

public class studs 
{
    int id;
    String name;
    int[] marks = new int[3];
    int sum = 0;
    public void get()
    {
        id = Integer.parseInt(JOptionPane.showInputDialog("Enter id : "));
        name = JOptionPane.showInputDialog("Enter name : ");
        for(int i=0;i<marks.length;i++)
        {
            marks[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter marks of subject "+(i+1)+" : "));
        }
    }
    public void total()
    {
        for(int i = 0;i <marks.length;i++)
        {
            sum +=marks[i];
        }
    }
    public void show()
    {
        System.out.println("Id : "+id);
        System.out.println("Name : "+name);
        System.out.println("The sum of scores of subjects = "+sum);
    }
}
