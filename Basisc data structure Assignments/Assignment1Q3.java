import java.util.*;
class SiCi {
    public void simpleInterest(double p,double r,double y){
double si=(p*r*y)/100;
System.out.println(si);

}
    public void compoundInterest(double p,double r,double y){
double ci=p * Math.pow(1 + (r / 100),  y);
System.out.println(ci);
}
}


public class Assignment1Q3 {
 public static void main (String args[]) {
double p,r,y;
Scanner sc =new Scanner(System.in);
p=sc.nextDouble();
r=sc.nextDouble();
y=sc.nextDouble();
SiCi obj=new SiCi();
obj.simpleInterest(p,r,y);
obj.compoundInterest(p,r,y);

}
}

