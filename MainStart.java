
import java.util.*;
import user.*;
public class MainStart {
public static void main(String... rr){

    while(true){
System.out.println("1 for register\n2 for login");
Scanner sc = new Scanner(System.in);
int ch =sc.nextInt();
if(ch==1){
    System.out.println("enter name ,email & password");
    String name = sc.next();
    String email = sc.next();
    String password = sc.next();
    Register r =new Register();
    r.userRegister(name,email,password);
}
else if(ch ==2){
     System.out.println("enteremail & password");
   
    String email = sc.next();
    String password = sc.next();
    Login r =new Login();
    r.userLogin(email,password);

}
else{
    System.out.println("not user data");
}
    }
}
    
}
