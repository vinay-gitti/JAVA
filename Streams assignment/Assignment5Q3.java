package JavaFiles;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Trader {
    private String name;
    private String city;
    
    public Trader(String name, String city) {
	  this.name = name;
	  this.city = city;
	}


public String getName() {return name;}
public String getCity() {return city;}


public String toString(){ return "Trader{name='"+this.name+"', city='"+this.city+"'}";}

}

public class Assignment5Q3 {
    public static List<String> printUniqueCities (List <Trader> traders) {
    	List<String> list=(List<String>) traders.stream().map(p->p.getCity()).distinct().collect(Collectors.toList());
    	//traders.stream().map(p->p.getCity()).forEach(e->System.out.println(e));
        return list;
    }

    public static List<String> tradersFromPuneSortByName(List<Trader> traders) {
    	List<String> list = new ArrayList<>();
 	    traders.stream().filter(c -> c.getCity().equalsIgnoreCase("pune")).forEach(e -> list.add(e.getName()));
 	    Collections.sort(list);
 	    return list;
    }
    
    public static String allTrader3Names(List<Trader> traders) {
    	String str="";
 	    List<String> list = new ArrayList<>();
 	    traders.stream().forEach(item -> list.add(item.getName()));
 	    Collections.sort(list);
 	   
 	    for(String str1: list){
 	    	str=str+"\n"+str1;
 	    }
 	    return str;
    }
    
    public static ArrayList<Trader> areAnyTradersFromIndore(ArrayList<Trader> traders) {
    	ArrayList<Trader> list = new ArrayList<>();
 	    traders.stream().filter(city -> city.getCity().equalsIgnoreCase("indore")).forEach(item -> list.add(item));
 	    return list;
    }
    public static void main(String[] args) {
    	List<Trader> list = new ArrayList<>();
		Scanner scan= new Scanner(System.in);
		
		System.out.print("Enter the number of traders: ");
		int n= scan.nextInt();
		
        for(int i=0;i<n;i++) {
	   		 
	   		System.out.print("Enter the name of trader "+(i+1)+"  : ");
	   		String name= scan.next();
			
			System.out.print("Enter the city of trader "+(i+1)+" : ");
			String city= scan.next();
	   	    city=city.toLowerCase();
	   	       		 
	   		list.add(new Trader(name,city));
	   	 }
        
        System.out.println("\nUnique Cities: ");
        printUniqueCities(list).forEach(item-> System.out.println(item));
        
        System.out.println("\nTraders from Pune sorted by Name: ");
        tradersFromPuneSortByName(list).forEach(item-> System.out.println(item));
        
        System.out.println("\nAll traders name sorted alphabetically: ");
        System.out.println(allTrader3Names(list));
        
        System.out.println("\nTraders from Indore: ");
        areAnyTradersFromIndore((ArrayList<Trader>)list).forEach(item -> System.out.println(item));
    }
}
