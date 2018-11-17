package Menu;

import java.util.Iterator;

public interface Menu
{
    public void addItem(String name, double price);
    public Iterator createIterator();
}
