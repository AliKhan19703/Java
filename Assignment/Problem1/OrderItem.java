/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem1;


public class OrderItem {
    private String UPC;
    private int Quantity;
    private int Price;

    public OrderItem(String UPC, int Quantity, int Price) {
        this.UPC = UPC;
        this.Quantity = Quantity;
        this.Price = Price;
    }
    public int getCost()
    {
        int Cost;
        Cost = Quantity*Price;
        return Cost;
    }
    @Override
    public String toString()
    {
        String str;
        str = "UPC : "+UPC+", Quantity : "+Quantity+", Price : "+Price;
        return str;
    }
    
}
