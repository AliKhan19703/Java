
package com.mycompany.lab4;
import java.io.*;
public class ReadingSimplifier {
    public static void main(String [] args)
    {
        String name = readString("Enter your name :");
        int age = readInt("Enter your age :");
        System.out.println("Welcome "+name);
        System.out.println("Your birth year is "+(2023-age));
              
    }
    static String readString(String message)
    {
        System.out.println(message);
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try{
            String input = in.readLine();
            return input;
        }
        catch(Exception e){}
        return "";
    }
        static int readInt(String message){
            String input = readString(message);
            return Integer.parseInt(input);
        }
        
    
}
