
package com.mycompany.lab4;

class Building
{
    int floors;
    double area;
    int occupants;
    void set(int no_floors,double area_M,int no_occupants)
    {
        floors = no_floors;
        area = area_M;
        occupants = no_occupants;
    }
    double areaperperson()
    {
        return (area/(floors*1.0*occupants));
    }
}

public class Exercise2 {
    public static void main(String[] args){
        Building office = new Building();
        Building house = new Building();
        office.set(3, 3, 11);
        house.set(1, 10, 5);
        System.out.println("The number of area per person in office "+office.areaperperson());
        System.out.println("The number of area per person in house "+house.areaperperson());
        
    }
    
}
