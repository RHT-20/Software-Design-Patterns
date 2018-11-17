package Menu;

import MenuIterator.DinerMenuIterator;
import Main.ItemInfo;
import java.util.Iterator;

public class DinerMenu implements Menu
{
    static final int MAX_ITEM = 10;
    private ItemInfo[] dMenu;
    private int pos;
    
    public DinerMenu()
    {
        dMenu = new ItemInfo[MAX_ITEM];
        pos = 0;
    }
    
    @Override
    public void addItem(String name, double price)
    {
        if(pos >= MAX_ITEM)
        {
            System.out.println("Sorry no space available to add new item.");
        }
        else
        {
            dMenu[pos] = new ItemInfo(name, price);
            pos++;
        }
    }

    @Override
    public Iterator createIterator() 
    {
        return  new DinerMenuIterator(dMenu);
    }
}
