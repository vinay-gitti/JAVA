package JavaFiles;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Assignment4Q7 {
    public static void main(String[] args) {
    	 HashMap<String,Integer> m = new LinkedHashMap<String,Integer>();   	
    	 Scanner scan= new Scanner(System.in);
   	 
	   	 System.out.print("Enter the number of elements: ");
	   	 int s= scan.nextInt();
	   	 
	   	 
	   	 for(int i=0;i<s;i++) {
	   		 
	   		 System.out.print("enter the key "+(i+1)+" in the map   : ");
	   		 String strkey= scan.next();
	   		 
	   		 System.out.print("enter the value "+(i+1)+" in the map : ");
	   		 int strvalue= scan.nextInt();
	   		 
	   		 m.put(strkey,strvalue);
	   	 }
	   	 
	   	System.out.print(new Assignment4Q7().convertKeyValueToString(m));
    }
    
    public String convertKeyValueToString(HashMap<String, Integer> map) {
    	StringBuilder sb=new StringBuilder("");
    	map.entrySet().stream().forEach(e -> {sb.append(e.getKey()); sb.append(e.getValue());});
    	return sb.toString();
    }
}