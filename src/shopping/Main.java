package shopping;


import shopping.Customer.Cart;
import shopping.Customer.Item;
import shopping.Customer.ItemType;
import shopping.Customer.Product;
import shopping.Customer.User;
import shopping.Customer.UserType;
import shopping.Customer.discount.DiscountPolicy;
import shopping.Customer.discount.ThresholdDiscount;
import java.util.Scanner;
class Main {
    public static void main (String[] args)
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the name of Customer");
    	String name = sc.next();
    	System.out.println("Enter option for customer\n1.Employee\n2.Affiliate\n3.Simple");
    	int choice = sc.nextInt();
    	System.out.println("Enter item");
    	String itemName = sc.next();
    	System.out.println("Enter option for item \n1.Grocery\n2.other");
    	int itemChoice = sc.nextInt();
    	System.out.println("Enter price of item");
    	double price = sc.nextDouble();
    	System.out.println("Quantity of item");
    	int itemQuant = sc.nextInt();
    	
    	
    	if(choice==1) {
    		User employee = new User(name,UserType.EMPLOYEE);
    		DiscountPolicy discountPolicy = new ThresholdDiscount();
    		Cart cart = new Cart(employee, discountPolicy);
    		
    		if(itemChoice==1) {
    			Item groceryItem = new Product(itemName, price, ItemType.GROCERY);
    			cart.add(groceryItem, itemQuant);
    		}
    		else {
    			Item otherItem = new Product(itemName, price, ItemType.OTHER);
    			cart.add(otherItem, itemQuant);
    		}
            System.out.println(cart.total());  
    	}
    	else if(choice == 2) {
    		User affiliate = new User(name,UserType.AFFILIATE);
    		DiscountPolicy discountPolicy = new ThresholdDiscount();
    		Cart cart = new Cart(affiliate, discountPolicy);
    		if(itemChoice==1) {
    			Item groceryItem = new Product(itemName, price, ItemType.GROCERY);
    			cart.add(groceryItem, itemQuant);
    		}
    		else {
    			Item otherItem = new Product(itemName, price, ItemType.OTHER);
    			cart.add(otherItem, itemQuant);
    		}
            System.out.println(cart.total()); 
    		
    	}
    	else if (choice==3) {
    		User simple = new User(name,UserType.SIMPLE);
    		DiscountPolicy discountPolicy = new ThresholdDiscount();
    		Cart cart = new Cart(simple, discountPolicy);
    		if(itemChoice==1) {
    			Item groceryItem = new Product(itemName, price, ItemType.GROCERY);
    			cart.add(groceryItem, itemQuant);
    		}
    		else {
    			Item otherItem = new Product(itemName, price, ItemType.OTHER);
    			cart.add(otherItem, itemQuant);
    		}
            System.out.println(cart.total()); 
    		
    	}
        /*
         *  Total (20 * 4) + (222 * 4) = 968
         *  No discount on grocery items = 968 still
         *  After 30% discount on 4 other items totalling 888 = 701.6
         *  After 35 dollars off due to price over $700 = 666.59999 or 666.6 
         */
              
    }
}