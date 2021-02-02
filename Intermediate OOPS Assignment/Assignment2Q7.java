package JavaFiles;

import java.util.Scanner;

abstract class DesertItem {

    abstract public int getCost(int desertItem);
}
class Candy extends DesertItem {
    public int addCandies(int candies){
		return candies;
		}

	@Override
	public int getCost(int candies) {
		int dollar=60;
		int cost=candies*dollar;
		return cost;
	}
}
class Cookie extends DesertItem {
    public int addCookies(int cookies){
		return cookies;
		}

	@Override
	public int getCost(int cookies) {
		int euro=70;
		int cost=cookies*euro;
		return cost;
	}
}
class IceCream extends DesertItem {
    public int addIceCreams(int icecreams){
		return icecreams;
		}

	@Override
	public int getCost(int icecream) {
		int rupee=65;
		int cost=icecream*rupee;
		return cost;
	}
}
public class Assignment2Q7 {
	static int Candies=0;
	static int Cookies=0;
	static int Icecreams=0;
	Scanner scan=new Scanner(System.in);
	Candy candy=new Candy();
	Cookie cookie=new Cookie();
	IceCream icecream=new IceCream();
	
    public static void main(String[] args) {
    	Assignment2Q7 answer=new Assignment2Q7();
    	answer.selectRoles();
    }
    
    private void selectRoles(){
    	String role="";
    	System.out.println("Inventory: \n Candies: "+Candies+"\n Cookies: "+Cookies+"\n Icecreams: "+Icecreams);
    	System.out.println("Enter your role: ");
    	role=scan.next();
    	role=role.toLowerCase();
    	roles(role);	
    }
    
    private void roles(String role){
    	if(role.equals("owner"))
    	{
    		addItems();
    	}
    	else if(role.equals("customer"))
    	{
    		placeOrder();
    	}
    	else
    	{
    		System.out.println("Please enter a correct role!");
    		selectRoles();
    	}
    }
    
    private void addItems() {
    	System.out.println("What deserts do you like to add? \n 1.Candy \n 2.Cookies \n 3.Icecream \n 4.Back");
		int index;
		index=scan.nextInt();
		addItemsOperation(index);	
    }
    
    private void addItemsOperation(int choice) {
    	switch(choice) {
		   case 1:
			   System.out.println("Enter number of candies to be added: ");
			   int candies=scan.nextInt();
			   Candies=candies;
			   candy.addCandies(candies);
			   addItems();
			   break;
			   
		   case 2:
			   System.out.println("Enter number of cookies to be added: ");
			   int cookies=scan.nextInt();
			   Cookies=cookies;
			   cookie.addCookies(cookies);
			   addItems();
			   break;
			   
		   case 3:
			   System.out.println("Enter number of Icecreams to be added: ");
			   int icecreams=scan.nextInt();
			   Icecreams=icecreams;
			   icecream.addIceCreams(icecreams);
			   addItems();
			   break;
			   
		   case 4:
			   selectRoles();
			   
		   default:
			   System.out.println("Please enter a valid choice!");
			   addItems();
			   break;
		}
    }
    
    private void placeOrder() {
    	if(Candies!=0||Cookies!=0||Icecreams!=0||Candies+Cookies+Icecreams!=0)
    	{
    		System.out.println("What deserts do you like to buy? \n 1.Candy \n 2.Cookies \n 3.Icecream \n 4.Back");
    		int index;
    		index=scan.nextInt();
    		placeOrderOperation(index);
    	}
    	else
    	{
    		System.out.println("Inventory is empty. Please tell the owner to add items.\n");
    		selectRoles();
    	}
    }
    
    private void placeOrderOperation(int choice) {
    	switch(choice) {
		   case 1:
			   System.out.println("Candies are sold in Dollars. \n 1 candy costs 1 dollar");
			   System.out.println("Enter number of candies to be bought: ");
			   int candies=scan.nextInt();
			   if(candies<Candies)
			   {
				   Candies=Candies-candies;
				   System.out.println("Cost in Rupees: "+candy.getCost(candies));
			   }
			   else
			   {
				   System.out.println("Please enter a number according to the inventory");
			   }
			   placeOrder();
			   break;
			   
		   case 2:
			   System.out.println("Cookies are sold in Euros. \n 1 cookie costs 1 euro");
			   System.out.println("Enter number of cookies to be bought: ");
			   int cookies=scan.nextInt();
			   if(cookies<Cookies)
			   {
				   Cookies=Cookies-cookies;
				   System.out.println("Cost in Rupees: "+cookie.getCost(cookies));
			   }
			   else
			   {
				   System.out.println("Please enter a number according to the inventory");
			   }
			   placeOrder();
			   break;
			   
		   case 3:
			   System.out.println("Icecreams are sold in Rupees. \n 1 icecream costs 65 rupees");
			   System.out.println("Enter number of Icecreams to be bought: ");
			   int icecreams=scan.nextInt();
			   if(icecreams<Icecreams)
			   {
				   Icecreams=Icecreams-icecreams;
				   System.out.println("Cost in Rupees: "+icecream.getCost(icecreams));
			   }
			   else
			   {
				   System.out.println("Please enter a number according to the inventory");
			   }
			   placeOrder();
			   break;
			   
		   case 4:
			   selectRoles();	   
			   
		   default:
			   System.out.println("Please enter a valid choice!");
			   placeOrder();
			   break;
        }
    }
}