import java.util.*;

class Login{
    String userId = "Ajay",password = "password";
  int v=0,c=0;
    public void loginUser(String user, String pass) {
  while(c<2){
     if(user.equals(userId) && pass.equals(password))
   {  System.out.println("Welcome Ajay");
       v=1;
     break;     }
   else{


System.out.println("You have entered wrong credentials ,please enter the right credentials.");
String id ,pas;
c+=1;
Scanner sc=new Scanner(System.in);
System.out.println("Enter userId");
id=sc.next();
System.out.println("Enter password");
pas=sc.next();
loginUser(id,pas);
}

    


if(v==0){
System.out.println("You have entered wrong credentials 3 times");
System.out.println("Contact Admin");
break;
}}}

}



public class Assignment1Q6 {
    public static void main(String[] args) {
Login obj=new Login();
Scanner sc=new Scanner(System.in);
String userId,pass;

System.out.println("Enter userId");
userId=sc.next();
System.out.println("Enter password");
pass=sc.next();
obj.loginUser(userId,pass);




}
}

