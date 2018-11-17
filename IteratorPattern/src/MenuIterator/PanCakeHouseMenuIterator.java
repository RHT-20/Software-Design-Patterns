package MenuIterator;

import Main.ItemInfo;
import java.util.ArrayList;
import java.util.Iterator;

public class PanCakeHouseMenuIterator implements Iterator
{
    private ArrayList<ItemInfo> pchMenu;
    int pos;
    
    public PanCakeHouseMenuIterator(ArrayList<ItemInfo> item)
    {
        pchMenu = item;
        pos = 0;
    }

    @Override
    public boolean hasNext()
    {
        if(pos >= pchMenu.size() || pchMenu.get(pos) == null)   return false;
        return true;
    }

    @Override
    public ItemInfo next()
    {
        ItemInfo item = pchMenu.get(pos);
        pos++;
        return item;
    }

    public void remove(int pos)
    {
        if(pos >= pchMenu.size())
        {
            System.out.println("Sorry no such item available to remove.");
        }
        else
        {
            for(int i=pos; i<pchMenu.size(); i++)
            {
                try
                {
                    pchMenu.set(i-1, pchMenu.get(i));
                }
                catch (Exception e) {}
            }
            pchMenu.set(pchMenu.size()-1, null);
        }
    }
}
