package Main;

import Menu.PanCakeHouseMenu;
import Menu.DinerMenu;

public class Main 
{
    public static void main(String[] args) 
    {
        DinerMenu dinerMenu = new DinerMenu();
        dinerMenu.addItem("FRIED CHICKEN AND WAFFLE", 180.0);
        dinerMenu.addItem("THE BISSELL BREAKFAST", 160.0);
        dinerMenu.addItem("HUEVOS RANCHEROS", 200.0);
        
        PanCakeHouseMenu panCakeHouseMenu = new PanCakeHouseMenu();
        panCakeHouseMenu.addItem("Asian Chicken Bites", 380.0);
        panCakeHouseMenu.addItem("Prime Rib Slider", 400.0);
        panCakeHouseMenu.addItem("Mediterranean Goat Cheese Platter", 450.0);
        
        Waitress waitress = new Waitress(dinerMenu, panCakeHouseMenu);
        waitress.printMenuCaller();
        
        waitress.removeItemCaller(2, 1);
        waitress.printMenuCaller();
        
        panCakeHouseMenu.addItem("CLASSIC PANCAKES", 200.0);
        waitress.printMenuCaller();
    }
}
