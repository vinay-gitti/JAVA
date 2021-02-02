package JavaFiles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class Assignment4Q8 {
	public static void main(String[] arg) {
		
		 List<Integer> list = new ArrayList<Integer>();
	   	 Scanner scan= new Scanner(System.in);
	   	 
	   	 System.out.print("Enter the number of elements: ");
	   	 int s= scan.nextInt();
	   	 
	   	 for(int i=0;i<s;i++) {
	   		 
	   		 System.out.print("enter the element "+(i+1)+" in the list : ");
	   		 int number= scan.nextInt();
	   		 
	   		 list.add(number);
	   	 }
	   	 
		 Thread t = new Thread(new ThreadDemo(list)); 
		 t.start();
	}
}

class ThreadDemo extends Thread{
	
	List<Integer> list = new ArrayList<Integer>();
	ThreadDemo(List<Integer> l){list=l;}
	Consumer<List<Integer> > dispList = list -> list.stream().forEach(a -> System.out.print(a + " "));
	
	public void run() { 
	  dispList.accept(list); 
	} 
	
}