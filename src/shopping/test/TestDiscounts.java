package shopping.test;
import shopping.Customer.Product;
import shopping.Customer.User;
import shopping.Customer.UserType;
import shopping.Customer.discount.DiscountPolicy;
import shopping.Customer.discount.ThresholdDiscount;


import java.util.Scanner;

import shopping.Customer.Cart;
import shopping.Customer.Item;
import shopping.Customer.ItemType;




/*
 * Test Cases for no discount policy
 */
public class TestDiscounts {

   

    public static void main(String[] args) {
    	Scanner sc =new Scanner(System.in);
    	 Item groceryItem;
    	 Item otherItem;
    	 User employee;
    	 DiscountPolicy discountPolicy;
   
    	employee = new User("John",UserType.EMPLOYEE);
    	groceryItem = new Product("Rice", 20, ItemType.GROCERY);
        System.out.println("Enter choice to check \n1.grocerry\n2.other");
        int choice = sc.nextInt();
        if(choice==1) {
        discountPolicy = new ThresholdDiscount();
    
        Cart cart = new Cart(employee, discountPolicy);
        cart.add(groceryItem, 4);
        // No discount because of grocery item
        if(cart.total()==80) {
        	System.out.println("No discount because of grocery item");
        
        }
        }
        else if(choice==2) {
        discountPolicy = new ThresholdDiscount();
        otherItem = new Product("TV", 222, ItemType.OTHER);
        Cart cart= new Cart(employee, discountPolicy);
        cart.add(otherItem, 4);
        /*
         *  30% discount then 5 dollars off of each 100 dollars of total price because of other item
         *  Total 222 * 4 = 888
         *  After 30% discount = 621.6
         *  After 30 dollars off due to price over $600 = 591.6 
         */
        
        if(Math.round(cart.total()*10.0)/10.0==591.6) {
        	System.out.println("it's right amount");
        }
        
        }
 
    
    
}
}