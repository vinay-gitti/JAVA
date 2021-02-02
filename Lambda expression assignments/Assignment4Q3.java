package JavaFiles;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Assignment4Q3 {
	static Product product=new Product("Brush");
	
	static int modifyValue(int a, Function<Integer, Integer> b)
    { 
      return b.apply(a);
    }
	
	static void modifyValue()
    { 
    	Consumer<Product> updateName = a -> a.setName("ToothBrush");
    	updateName.accept(product);
    }
    
    static class Product {
    	String name;
    	Product(String name)
    	{
    		this.name=name;
    	}
    	public void setName(String name)
    	{
    		this.name=name;
    	}
    	public String getName()
    	{
    		return this.name;
    	}
    }
    
    static void display() 
    {
        
    	System.out.println(product.getName()); 
    	
    	Supplier<Integer> supplier = () -> new Integer((int) (Math.random() * 1000D));
    	System.out.println(supplier.get());
    	
    	Function<Integer, Integer> multiply = (value) -> value * 3;
    	Integer resultLambda = multiply.apply(8);
    	System.out.println("resultLambda = " + resultLambda);
    	
    	Predicate<String> predicate = (value) -> value.length()>5;
    	System.out.println(predicate.test(product.getName()));
    }
    
    public static void main(String[] args) {
    	modifyValue();
    	display();
    }
}