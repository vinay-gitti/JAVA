class SearchArray{
    public void searchArray(int[] arr,int toCheckValue){
int c=0;
 for(int i:arr){
if(i==toCheckValue)
{System.out.println("element found");
c+=1;
}

}
if(c==arr.length)
System.out.println("element not found");

}
}


public class Assignment1Q7 {
    public static void main(String[] args) {
SearchArray obj=new SearchArray();
        int arr[] = { 5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        int valueToCheck = 19;
 obj.searchArray(arr,valueToCheck);

}}
   