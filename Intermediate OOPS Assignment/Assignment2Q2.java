package JavaFiles;

import java.util.ArrayList;

class Manager extends Assignment2Q2 {
    @Override
    public int getSalary(int salary) {
        int incentive = 5000;
        return (salary+incentive);
    }
}

class Labour extends Assignment2Q2 {
    @Override
    public int getSalary(int salary) {
        int overtime = 500;
        return (salary+overtime);
    }
}

public class Assignment2Q2 {
    static int salary = 10000;
    public int getSalary(int salary){return salary;}
    public int totalEmployeesSalary(ArrayList<Integer> employeeSalaries){
    	int sum = 0;
        for(int i = 0; i < employeeSalaries.size(); i++)
               sum += employeeSalaries.get(i);
        return sum;
        }
    public static void main(String[] args) {
    	
    	Manager manager=new Manager();
    	int msalary=manager.getSalary(salary);
    	System.out.println("Employee Salary: "+msalary);
    	
    	Labour labour=new Labour();
    	int lsalary=labour.getSalary(salary);
    	System.out.println("Labour Salary: "+lsalary);
    	
    	ArrayList<Integer> employeeSalaries=new ArrayList<Integer>();
    	employeeSalaries.add(msalary);
    	employeeSalaries.add(lsalary);
    	Assignment2Q2 answer=new Assignment2Q2();
    	System.out.println("Total Employee Salary: "+answer.totalEmployeesSalary(employeeSalaries));
    }
}