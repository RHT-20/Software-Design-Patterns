package MenuIterator;

import Main.ItemInfo;
import java.util.Iterator;

public class DinerMenuIterator implements Iterator
{
    private ItemInfo[] dMenu;
    int pos;
    
    public DinerMenuIterator(ItemInfo[] item)
    {
        dMenu = item;
        pos = 0;
    }
    
    @Override
    public boolean hasNext() 
    {
        if(pos >= dMenu.length || dMenu[pos] == null)   return false;
        return true;
    }

    @Override
    public ItemInfo next() 
    {
        ItemInfo item = dMenu[pos];
        pos++;
        return item;
    }

    public void remove(int pos)
    {
        if(pos >= dMenu.length || dMenu[pos] == null)
        {
            System.out.println("Sorry no such item available to remove.");
        }
        else
        {
            for(int i=pos; i<dMenu.length; i++)
            {
                try 
                {
                    dMenu[i-1] = dMenu[i];
                }
                catch (Exception e) {}
            }
            dMenu[dMenu.length - 1] = null;
        }
    }
}
