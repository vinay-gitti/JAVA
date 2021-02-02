package JavaFiles;

abstract class numericals{
	int a;
}

abstract class calculate extends numericals{
	public abstract void multiply();
}

public class Assignment2Q4 extends calculate {
	@Override
	public void multiply() {
	// TODO Auto-generated method stub
		System.out.print(23*24);
	}
	public static void main(String args[])
	{
		calculate cal =new Assignment2Q4();
		cal.multiply();
	}
}