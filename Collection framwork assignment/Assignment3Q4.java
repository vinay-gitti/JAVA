package JavaFiles;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class DateClass {
    private int date;
    private int month;
    private int year;
    private String dob;
    
    public DateClass(int date, int month, int year)
    {
    	this.date=date;
    	this.month=month;
    	this.year=year;
    }
    
    public int getDate()
    {
    	return this.date;
    }
    
    public void setDate(int date)
    {
    	this.date=date;
    }
    
    public int getMonth()
    {
    	return this.month;
    }
    
    public void setMonth(int month)
    {
    	this.month=month;
    }
    
    public int getYear()
    {
    	return this.year;
    }
    
    public void setYear(int year)
    {
    	this.year=year;
    }
    
    public String getDOB()
    {
    	return this.date+"/"+this.month+"/"+this.year;
    }
    
    public void setDOB(String dob)
    {
    	this.dob=dob;
    }
    
    @Override
    public boolean equals(Object o) 
    { 
        if (this == o) { 
            return true; 
        } 
        if (o == null) { 
            return false; 
        } 
        if (this.getClass() != o.getClass()) { 
            return false; 
        } 
        DateClass other = (DateClass)o; 
        if (this.date == other.date && this.month==other.month) { 
            return false; 
        } 
        return true; 
    } 
}

public class Assignment3Q4 {

    public void getEmployee(HashMap<DateClass, String> dob,String employeeName)
    {
    	HashMap<String,String> Employees=new HashMap<>();
    	String[] employeeNames=employeeName.split(",");
    	String[] values=new String[employeeNames.length];
    	String value="";
    	Iterator trav=dob.entrySet().iterator();
    	while(trav.hasNext())
    	{
    		Map.Entry record=(Map.Entry)trav.next();
    		String name=(String) record.getValue();
    		value+=name+" ";
    	}
    	
    	values=value.split(" ");
    	Arrays.sort(values);
    	for(int i=0;i<4;i++)
    	{
    		Employees.put(values[i], employeeNames[i]);	
    	}
    	System.out.println(Employees);
	}
    public static void main(String[] args) 
    {
    	HashMap<DateClass, String> dob = new HashMap<>();
    	DateClass one=new DateClass(28,2,1999);
    	DateClass two=new DateClass(14,6,1989);
    	DateClass three=new DateClass(28,2,1998);
    	DateClass four=new DateClass(20,1,1999);
    	
    	dob.put(one, one.getDOB());
    	dob.put(two,two.getDOB());
    	dob.put(three, three.getDOB());
    	dob.put(four, four.getDOB());
    	
    	String employeeName="Arun,Bharath,Chandra,Dinesh";
    	Assignment3Q4 answer=new Assignment3Q4();
    	
    	for(Map.Entry<DateClass,String> entry: dob.entrySet())
        {
    		for(Map.Entry<DateClass, String> entry1: dob.entrySet())
    		{
    			if (!entry.getKey().equals(entry1.getKey())) 
    	           {
    	             if (!entry.getValue().equals(entry1.getValue())) {
    	            	 answer.getEmployee(dob, employeeName);
    	            	 break;
    	             }
    	             else
    	             {
    	            	 System.exit(0);
    	             }
    	             break;
    	           }
    			break;
    		}
        }
    }
}