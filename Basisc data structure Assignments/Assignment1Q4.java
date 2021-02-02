import java.util.*;
class ResultDeclaration{
    public void declareResults( double m1, double m2, double m3) {

double sum=m1+m2+m3;
 if(sum>180)
System.out.println("Passed");
 else if(sum>120 && sum<180)
System.out.println("Promoted");
else
System.out.println("failed");
}
}
public class Assignment1Q4 {
    public static void main(String[] args) {
double m1,m2,m3;
Scanner sc=new Scanner(System.in);
m1=sc.nextDouble();
m2=sc.nextDouble();
m3=sc.nextDouble();
ResultDeclaration obj=new ResultDeclaration();
obj.declareResults(m1,m2,m3);
  
}
}