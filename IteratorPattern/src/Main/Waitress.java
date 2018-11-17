package Main;

import MenuIterator.PanCakeHouseMenuIterator;
import MenuIterator.DinerMenuIterator;
import Menu.Menu;
import java.util.Iterator;

public class Waitress
{
    private Menu dMenu, pchMenu;
    
    public Waitress(Menu dMenu, Menu pchMenu)
    {
        this.dMenu = dMenu;
        this.pchMenu = pchMenu;
    }
    
    public void printMenuCaller()
    {
        Iterator dIterator = dMenu.createIterator();
        System.out.println("----- DinerMenu -----");
        printMenu(dIterator);
        
        Iterator pIterator = pchMenu.createIterator();
        System.out.println("----- PanCakeHouseMenu -----");
        printMenu(pIterator);
    }
    
    public void removeItemCaller(int id, int pos)
    {
        if(id == 1)
        {
            DinerMenuIterator dIterator = (DinerMenuIterator) dMenu.createIterator();
            dIterator.remove(pos);
        }
        else
        {
            PanCakeHouseMenuIterator PIterator = (PanCakeHouseMenuIterator) pchMenu.createIterator();
            PIterator.remove(pos);
        }
    }
    
    public void printMenu(Iterator it)
    {
        Iterator iterator = it;
        while(it.hasNext())
        {
            ItemInfo item = (ItemInfo) it.next();
            System.out.println("Name: " + item.getName() + " | Price: "+ item.getPrice());
        }
        System.out.println("");
    }
}
