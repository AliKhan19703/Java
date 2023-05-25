
package Problem1;

/**
 *
 * @author Ali Khan
 */
public class RushOrder extends Order {
    protected int deliveryDay;

    public RushOrder(int deliveryDay) {
        this.deliveryDay = deliveryDay;
    }
    
    @Override
    public int getTotal()
    {
        int total = super.getTotal();
        if(total >0)
        {
            if(deliveryDay == 1)
            {
                total +=20;
            }
            else if(deliveryDay ==2)
            {
                total +=15;
            }
            else if(deliveryDay ==3)
            {
                total+=10;
            }
            else
            {
                total += 0;
            }
        }
        else
        {
            return total;
        }
        return total;
    }
    @Override
    public String toString()
    {
        String str = "Type of Order : RushOrder";
        return str;
    }
    
}
