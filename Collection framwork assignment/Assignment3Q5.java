package JavaFiles;

import java.util.HashMap;

class Employee {
    private String name;
    private int id;
    
    public Employee(int id, String name) 
    { 
        this.id = id; 
        this.name = name; 
    } 

    public String getname() 
    { 
        return this.name; 
    } 

    public int getID() 
    { 
        return this.id; 
    } 

    public void setname(String name) 
    { 
        this.name = name; 
    } 

    public void setID(int id) 
    { 
        this.id = id; 
    } 

    @Override
    public int hashCode() 
    { 
        return 13; 
    } 

    @Override
    public boolean equals(Object o) 
    { 
        return true; 
    }
}

public class Assignment3Q5 {
    public static void main(String[] args) {
    	HashMap<Employee, String> map = new HashMap<>(); 
    	  
        Employee one = new Employee(1, "Employee1");  
        Employee two = new Employee(2, "Employee2"); 
 
        map.put(one, one.getname()); 
        map.put(two, two.getname()); 
  
        one.setname("Not Employee1"); 
        two.setname("Not Employee2"); 
  
        System.out.println(map.get(one)); 
  
        System.out.println(map.get(two)); 
  
        Employee three = new Employee(1, "Employee3"); 
        
        System.out.println(map.get(three));
    }
}