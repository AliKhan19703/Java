
package com.mycompany.lab4;

class Book
{
    String BookId;
    int Pages;
    int Price;
    int getPrice()
    {
        return Price;
    }
    void set(String b_id,int no_pages,int price_book)
    {
        BookId = b_id;
        Pages = no_pages ;
        Price = price_book;
    }
    void show()
    {
        System.out.println("Book Id :"+BookId);
        System.out.println("Pages :"+Pages);
        System.out.println("Price :"+Price);
    }
}

public class Exercise1 {
    public static void main(String[] args)
    {
        Book B = new Book();
        B.set("Alchemist", 476, 1200);
        B.show();
    }
}
