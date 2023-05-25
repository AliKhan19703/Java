
package Problem1;
import java.util.Scanner;
import java.util.Random;

public class DriverClass {
    public static void main(String[] args)
    {
        Order[] orders = new Order[4];
        orders[0] = new Order();
        orders[1] = new RushOrder(1);
        orders[2] = new RushOrder(2);
        orders[3] = new RushOrder(3);
        Scanner kb = new Scanner(System.in);
        Random rand = new Random();
        String chk ="";
        do
        {
            String upc;
            System.out.println("Enter UPC for item or write 'done' to quit");
            upc = kb.nextLine();
            if(upc.equalsIgnoreCase("done"))
            {
                chk = upc;
                break;
            }
            System.out.println("Enter Quantity :");
            int quant = kb.nextInt();
            kb.nextLine();
            if(quant <=0)
            {
                System.out.println("Invalid Quantity!!");
                continue;
            }
            int price = rand.nextInt(50)+50;
            OrderItem OIObj = new OrderItem(upc,quant,price);
            int dDay = rand.nextInt(7);
            if(dDay >= 4)
            {
                orders[0].addOrderItem(OIObj);
            }
            else if(dDay == 1)
            {
                orders[1].addOrderItem(OIObj);
            }
            else if(dDay == 2)
            {
                orders[2].addOrderItem(OIObj);
            }
            else if(dDay == 3)
            {
                orders[3].addOrderItem(OIObj);
            }
            chk = "";
        }while(!chk.equals("done"));
        
        for(int i =0;i<orders.length;i++)
        {
            System.out.println(orders[i].toString());
            orders[i].printOrderItem();
            System.out.println("SubTotal : "+orders[i].getTotal());
        }
        int grandTotal = 0;
        for(int i =0;i<orders.length;i++)
        {
          
           grandTotal +=orders[i].getTotal();
        }
        System.out.println("Total Cost in all orders : "+grandTotal);
        
        
                
    }
    
}
