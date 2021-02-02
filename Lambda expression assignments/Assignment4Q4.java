package JavaFiles;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class Assignment4Q4 {
    public ArrayList<String> removeOddLength(ArrayList<String> employeeList){
    	Predicate<String> pre = e -> e.length()%2==1; 
    	employeeList.removeIf(pre);  	
    	return employeeList;
    }
    public static void main(String[] args) {
    	Scanner scan= new Scanner(System.in);

    	ArrayList<String> al= new ArrayList<String>();

    	System.out.print("enter the number of Strings you want to insert : ");
    	int i= scan.nextInt();

    	for (int j=0;j<i;j++){

	    	System.out.print("enter the string "+(j+1)+" : ");
	    	String s= scan.next();

	    	al.add(s);
    	}
    	new Assignment4Q4().removeOddLength(al).forEach(n -> System.out.println(n));
    }
}