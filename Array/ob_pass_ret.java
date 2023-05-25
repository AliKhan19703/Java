
package com.mycompany.week5;


class ob_pass_ret {
    int x;
    int y;
    public void set(int a,int b)
    {
        x = a;
        y = b;
    }
    public ob_pass_ret update(ob_pass_ret obj)
    {
        obj.x+=10;
        obj.y+=10;
        ob_pass_ret temp = new ob_pass_ret();
        temp.x = obj.x+this.x;
        temp.y = obj.y+this.y;
        return temp;
    }
    public void show()
    {
        System.out.println(x+"\t"+y);
    }
}
