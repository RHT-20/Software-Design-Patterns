package Main;

import Topping.Topping5;
import Topping.Topping4;
import Topping.Topping3;
import Topping.Topping1;
import Topping.Topping2;
import Pizza.Pizza;
import Pizza.Pizza2;
import Pizza.Pizza5;
import Pizza.Pizza1;
import Pizza.Pizza4;
import Pizza.Pizza3;
import java.util.Scanner;

public class PizzaShop 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Select Your Favourite Pizza:");
        System.out.println("1. Pizza1");
        System.out.println("2. Pizza2");
        System.out.println("3. Pizza3");
        System.out.println("4. Pizza4");
        System.out.println("5. Pizza5");
        
        Pizza pizza = null;
        
        while(true)
        {            
            int item = scan.nextInt();
        
            if(item == 1)
            {
                pizza = new Pizza1();
                break;
            }
            else if(item == 2)
            {
                pizza = new Pizza2();
                break;
            }
            else if(item == 3)
            {
                pizza = new Pizza3();
                break;
            }
            else if(item == 4)
            {
                pizza = new Pizza4();
                break;
            }
            else if(item == 5)
            {
                pizza = new Pizza5();
                break;
            }
            else    System.out.println("Please enter again.");
        }
        
        System.out.println("Select Your Favourite Topping:");
        System.out.println("1. Topping1");
        System.out.println("2. Topping2");
        System.out.println("3. Topping3");
        System.out.println("4. Topping4");
        System.out.println("5. Topping5");
        
        System.out.println("How many Toppings do you want?");
        int n = scan.nextInt();
        
        while(n > 0)
        {
            int item = scan.nextInt();
            
            if(item == 1)
            {
                pizza = new Topping1(pizza);
                n--;
            }
            else if(item == 2)
            {
                pizza = new Topping2(pizza);
                n--;
            }
            else if(item == 3)
            {
                pizza = new Topping3(pizza);
                n--;
            }
            else if(item == 4)
            {
                pizza = new Topping4(pizza);
                n--;
            }
            else if(item == 5)
            {
                pizza = new Topping5(pizza);
                n--;
            }
            else    System.out.println("Please enter again.");
        }
        
        System.out.println("Pizza Description: " + pizza.getDescription()+" \nTotal Cost: "+pizza.getCost());
    }
}
