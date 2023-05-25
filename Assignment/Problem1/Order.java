
package Problem1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ali Khan
 */
public class Order {
    private List<OrderItem> list = new ArrayList<>();
    
    public void addOrderItem(OrderItem obj)
    {
       list.add(obj);
        
    }
    public int getTotal()
    {
        int totalCost = 0;
        for(int i =0;i<list.size();i++)
        {
            totalCost += list.get(i).getCost();
            
        }
        return totalCost;
    }
    public void printOrderItem()
    {
        for(int i =0;i<list.size();i++)
        {
            System.out.println(list.get(i).toString());
        }
    }
    @Override
    public String toString()
    {
        String str = "Type of Order : Order";
        return str;
    }
    
    
}
