
package com.mycompany.lab4;

class Patient {
    int age;
    String name;
    public Patient(){
        name = "Enter your name";
        age = 0;
    }
    public Patient(String n,int a){
        name = n;
        age = a;
    }
    
    public void show(){
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
    }
    
}
public class Practice{
    public static void main(String[] args){
        Patient P1 = new Patient("Sadiq",19);
      
        P1.show();
    }
}

