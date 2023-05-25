

package com.mycompany.week5;
import java.util.Scanner;

public class Fibonacii {
    int No;
    int Series[];
    public Fibonacii()
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a number : ");
        No = kb.nextInt();
        Series = new int[No];
        Series[0] = 1;
        Series[1] = 1;
    }
    public void GenerateSeries()
    {
        for(int i = 2;i<No;i++)
        {
            Series[i] = Series[i-2] + Series[i-1]; 
        }
    }
    public void showSeries()
    {
        System.out.println("Fibonacii Series ............");
        for(int i =0;i<No;i++)
        {
            System.out.print(Series[i]+" ");
        }
    }
    
}
