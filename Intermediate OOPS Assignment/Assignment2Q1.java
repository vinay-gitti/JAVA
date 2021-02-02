class SingletonInheritanceCheck{
	private static SingletonInheritanceCheck i=null;
	int j;
	private SingletonInheritanceCheck() {
		j=10;
	}
	public static SingletonInheritanceCheck getInstance() {
		if(i==null)
			i=new SingletonInheritanceCheck();
		return i;
	}
}

public class Assignment2Q1 {
	public static void main(String[] args) {
		SingletonInheritanceCheck a=SingletonInheritanceCheck.getInstance();
		a.j=20;
		System.out.print("Singleton Instance value: "+a.j);
	}
}