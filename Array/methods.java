
package com.mycompany.week5;


public class methods 
{
    public static void main(String[] args)
    {
        ob_pass_ret ob1 = new ob_pass_ret();
        ob_pass_ret ob2 = new ob_pass_ret();
        ob1.set(5,6);
        ob1.show();
        ob2.set(7,8 );
        ob2.show();
        ob1 = ob1.update(ob2);
        ob1.show();
        ob2.show();
    }
}
