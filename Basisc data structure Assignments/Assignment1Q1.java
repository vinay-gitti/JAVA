import java.util.*;
class ArmstrongOrNot {
    public void armstrongCheck(int num) {
     int sum=0;
     for(int i=num;i>0;i/=10){
         int rem=i%10;
	 sum+=rem*rem*rem;
       }
	if(sum==num){
     System.out.println("armstrong");
   }
      else
	System.out.println("not a armstrong number");
          
}}


public class Assignment1Q1 {
    public static void main(String[] args) {
 int n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
     ArmstrongOrNot obj=new ArmstrongOrNot();
    obj.armstrongCheck(n);
}
}