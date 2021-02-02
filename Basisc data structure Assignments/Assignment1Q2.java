import java.util.*;
class ArmstrongNumBetweenRange{
    public void armstrongNumbersInRange(int min , int max){
                  for(int i=min;i<=max;++i){
         int sum=0;
                      for(int j=i;j>0;j/=10){
                       int rem=j%10;
                        sum+=rem*rem*rem;
                             }
                 if(sum==i)
		   System.out.print(i+" ");
                     
                     }

                    }
}

public class Assignment1Q2 {
    public static void main (String [] args) {
  int min = 100;int max = 999;

 ArmstrongNumBetweenRange obj=new ArmstrongNumBetweenRange();
 obj.armstrongNumbersInRange(min,max);

     
    }
}

