package JavaFiles;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Assignment3Q2 {
    public static void main(String[] args) 
    { 
    	System.out.println("Insertion elements: 2 1 3 5 4");
    	
    	LinkedHashSet<Integer> numset = new LinkedHashSet<Integer>();
    	LinkedHashSet<Integer> numset1 = new LinkedHashSet<Integer>();
    	
    	numset1=ordered(numset);
    	System.out.print("Elements in LinkedHashSet: ");
    	System.out.println(numset1);
    	
    	
    	HashSet<Integer> numSet = new HashSet<Integer>();
    	HashSet<Integer> numSet1 = new HashSet<Integer>();
    	
    	numSet1=unordered(numSet);
    	System.out.print("Elements in HashSet: ");
    	System.out.print(numSet1);
    }
    
    public static LinkedHashSet<Integer> ordered(LinkedHashSet<Integer> linkedHashSet)
    {
    	linkedHashSet.add(2);
    	linkedHashSet.add(1);
    	linkedHashSet.add(3);
    	linkedHashSet.add(5);
    	linkedHashSet.add(4);
    	
    	return linkedHashSet; 
	}
    
    public static HashSet<Integer> unordered(HashSet<Integer> hashSet)
    {
    	hashSet.add(2);
    	hashSet.add(1);
    	hashSet.add(3);
    	hashSet.add(5);
    	hashSet.add(4);
    	return hashSet;
	}
}