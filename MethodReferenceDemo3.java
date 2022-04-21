package java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import java8features.Order.Side;

public class MethodReferenceDemo3 {

	public static void main(String[] args) {
		  Order ord;
		  Order ord1=new Order(1000, "GOOG.NS",120000.10,Side.BUY);
	      Order ord2=new Order(500,"MS.TS",5000.50,Order.Side.SELL);
	      Order ord3=new Order(750,"MS.TS",2000.50,Order.Side.BUY);
	       
	        List<Order> orderBook=new ArrayList<Order>();
	       
	        orderBook.add(ord1);
	        orderBook.add(ord2);
	        orderBook.add(ord3);
	       
	        // Sort all orders based on quantity using Lambda
	        System.out.println("Before Sorting : "+orderBook);// invokes toString() method
	
	        Collections.sort(orderBook,(a,b)->Order.compareByQuantity(a, b));
            System.out.println("After SOrting :"+orderBook);
            
            //sort all orders based on quantity using method reference by calling static method
            
            Collections.sort(orderBook,Order::compareByQuantity);
            System.out.println("After sorting :"+orderBook);
            
            //sort all orders based on price using method reference By calling instance method
            
            Order order=orderBook.get(0);
            Collections.sort(orderBook,order::compareByPrice);
            System.out.println("Order Book after sorting by price :"+orderBook);

            //method Reference example for Arbitrary Object  of a particular type 
            String[] symbols= {"GOOGLE", "amazon","microsoft","APPLE"};
            Arrays.sort(symbols,String::compareToIgnoreCase);
            
            for(String i:symbols)
            System.out.println(i);
            

            
            
            
	}

}
