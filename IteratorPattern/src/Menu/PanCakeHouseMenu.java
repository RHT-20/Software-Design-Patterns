package Menu;

import Main.ItemInfo;
import MenuIterator.PanCakeHouseMenuIterator;
import java.util.ArrayList;
import java.util.Iterator;

public class PanCakeHouseMenu implements Menu
{
    private ArrayList<ItemInfo> pchMenu;
    
    public PanCakeHouseMenu()
    {
        pchMenu = new ArrayList<>();
    }
    
    @Override
    public void addItem(String name, double price) 
    {
        boolean flag = false;
        ItemInfo item = new ItemInfo(name, price);
        
        for(int i=0; i<pchMenu.size(); i++)
        {
            if(pchMenu.get(i) == null)
            {
                pchMenu.set(i, item);
                flag = true;
            }
        }
        if(flag == false)   pchMenu.add(item);
    }

    @Override
    public Iterator createIterator()
    {
        return  new PanCakeHouseMenuIterator(pchMenu);
    }
}
