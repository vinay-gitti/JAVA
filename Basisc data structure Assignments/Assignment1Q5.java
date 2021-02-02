import java.util.*;

class TaxAmount{
    public void  calculateTaxAmount(int ctc){
 if(ctc>=0 && ctc<=180000)
 System.out.println("Nil");
 else if(ctc>=181001 && ctc<=300000)
 System.out.println(ctc*0.10);
 else if(ctc>=300001 && ctc<=50000)
 System.out.println(ctc*0.20);
 else
 System.out.println(ctc*0.30);

}
}




public class Assignment1Q5 {
    public static void main(String args[]) {
 TaxAmount obj=new  TaxAmount();
Scanner sc=new Scanner(System.in);
int ctc;
ctc=sc.nextInt();
obj.calculateTaxAmount(ctc);

}
}

