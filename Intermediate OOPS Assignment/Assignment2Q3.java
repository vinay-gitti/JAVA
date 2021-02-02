package JavaFiles;

import java.util.ArrayList;

class CurrentAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int creditLimit = 2000;
    @Override
    public int getCash() {return (totalDeposits-creditLimit);}
}
class SavingsAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int fixedDepositAmount = 5000;
    @Override
    public int getCash() {return (totalDeposits+fixedDepositAmount);}
}
public class Assignment2Q3 {
    public int totalCashInBank(ArrayList<Integer> cash){
    	int sum = 0;
        for(int i = 0; i < cash.size(); i++)
               sum += cash.get(i);
        return sum;
    }
    public int getCash(){return 0;}
    public static void main(String[] args) {
    	CurrentAccount currentAccount=new CurrentAccount();
    	SavingsAccount savingsAccount=new SavingsAccount();
    	int currentAmount=currentAccount.getCash();
    	int savingsAmount=savingsAccount.getCash();
    	ArrayList<Integer> cash=new ArrayList<Integer>(2);
    	cash.add(currentAmount);
    	cash.add(savingsAmount);
    	Assignment2Q3 answer=new Assignment2Q3();
    	System.out.println(answer.totalCashInBank(cash));
    }
}