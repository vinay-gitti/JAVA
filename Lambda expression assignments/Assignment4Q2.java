package JavaFiles;

import java.util.ArrayList;
import java.util.Iterator;

public class Assignment4Q2 {

    private int totalPrice;
    private String status;
    
    public Assignment4Q2(int price, String status)
    {
    	this.totalPrice=price;
    	this.status=status;
    }
    
    public int getPrice()
    {
    	return this.totalPrice;
    }
    
    public void setPrice(int price)
    {
    	this.totalPrice=price;
    }
    
    public String getStatus()
    {
    	return this.status;
    }
    
    public void setStatus(String status)
    {
    	this.status=status;
    }

    public static ArrayList<Assignment4Q2> listOfOrders(ArrayList<Assignment4Q2> orders) 
    {
    	Iterator<Assignment4Q2> iterator=orders.iterator();
    	while(iterator.hasNext())
    	{
    		Assignment4Q2 order=iterator.next();
    		if(order.getPrice()>10000 || order.getStatus().equals("Accepted/Completed")) {}
    	    else
    	    {
    	    	iterator.remove();
    	    }
    	}
		return orders;
	}
    public static void main(String[] args) {
    	Assignment4Q2 order1=new Assignment4Q2(2000,"Processing");
    	Assignment4Q2 order2=new Assignment4Q2(10000,"Processing");
    	Assignment4Q2 order3=new Assignment4Q2(6000,"Accepted/Completed");
    	Assignment4Q2 order4=new Assignment4Q2(4500,"Processing");
    	Assignment4Q2 order5=new Assignment4Q2(12000,"Accepted/Completed");
    	Assignment4Q2 order6=new Assignment4Q2(18000,"Processing");
    	
    	ArrayList<Assignment4Q2> orders=new ArrayList<Assignment4Q2>();
    	orders.add(order1);
    	orders.add(order2);
    	orders.add(order3);
    	orders.add(order4);
    	orders.add(order5);
    	orders.add(order6);
    	
    	orders=listOfOrders(orders);
    	
    	
    	orders.forEach((order) -> { System.out.println(order.getStatus()+" "+order.getPrice()); });
    }
}