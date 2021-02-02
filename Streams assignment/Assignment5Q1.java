package JavaFiles;

import java.util.*;
import java.util.stream.Collectors;
class Fruit {
    public String name;
    private int calories;
    private int price;
    private String color;
    public Fruit(String name, int calories, int price, String color) {
    	this.name = name;
    	this.calories = calories;
    	this.price = price;
    	this.color = color;
    }
    
    public String getName() {
    	return name;
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public int getCalories() {
    	return calories;
    }

    public void setCalories(int calories) {
    	this.calories = calories;
    }
    
    public int getPrice() {
    	return price;
    }
    
    public void setPrice(int price) {
    	this.price = price;
    }
    
    public String getColor() {
    	return color;
    }
    
    public void setColor(String color) {
    	this.color = color;
    }
    
    public String toString(){ return "Fruit{name='"+this.name+"', "+"calories="+this.calories+", "+"price="+this.price+", "+"color='"+this.color+"'}";}
   
}

public class Assignment5Q1 {

    public static List<String> reverseSort(ArrayList<Fruit> fruits)
    {
    	List<Fruit> Fruits=fruits.stream().filter(p->p.getCalories()<100).sorted(Comparator.comparing(Fruit::getCalories).reversed()).collect(Collectors.toList());
    	List<String> Fruit =new ArrayList<String>(); 
    	//System.out.println(Fruits.size());
    	for(int i=0;i<Fruits.size();i++)
    	{
    		Fruit.add(Fruits.get(i).name);
    	}
    	//System.out.println(Fruit);
    	return Fruit;
    }
    
    public static ArrayList<Fruit> sort(ArrayList<Fruit> fruits) 
    {
    	ArrayList<Fruit> Fruits=new ArrayList<Fruit>();
    	fruits.stream().sorted(Comparator.comparing(Fruit::getColor)).forEach(fruit->Fruits.add(fruit));
		return Fruits;
	}
    
    public static ArrayList<Fruit> filterRedSortPrice(ArrayList<Fruit> fruits)
    {
    	ArrayList<Fruit> Fruits=new ArrayList<Fruit>(); 
    	fruits.stream().filter(p->p.getColor()=="Red").sorted(Comparator.comparing(Fruit::getPrice)).forEach(fruit->Fruits.add(fruit));
    	return Fruits;
    }
    
    public static void main(String[] args)
    {
        ArrayList<Fruit> Fruits=new ArrayList<Fruit>();
        Scanner scan=new Scanner(System.in);
        int number;
        System.out.println("Enter number of fruits to be added: ");
        number=scan.nextInt();
        for(int i=0;i<number;i++)
        {
        	System.out.println("Enter name of fruit: ");
            String name=scan.next();
            System.out.println("Enter calories of fruit: ");
            int calories=scan.nextInt();
            System.out.println("Enter price of fruit: ");
            int price=scan.nextInt();
            System.out.println("Enter color of fruit: ");
            String color=scan.next();
            Fruits.add(new Fruit(name,calories,price,color));
        }
        
        List<String> Fruit1=reverseSort(Fruits);
        Fruit1.forEach((fruit)-> { System.out.println(fruit); });
        
        System.out.print("\n");
        
        ArrayList<Fruit> Fruit2=new ArrayList<Fruit>();
        Fruit2=(ArrayList<Fruit>) sort(Fruits);
        Fruit2.forEach((fruit)-> { System.out.println(fruit); });
        
        System.out.print("\n");
        
        ArrayList<Fruit> Fruit3=new ArrayList<Fruit>();
        Fruit3=(ArrayList<Fruit>) filterRedSortPrice(Fruits);
        Fruit3.forEach((fruit)-> { System.out.println(fruit); });
   
     }

}