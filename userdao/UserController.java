package userdao;
import datainfo.* ;
public class UserController {

    public void getUserRegister(DataInfo d){
        if(d.getName().equals("")&& d.getEmail().equals("") && d.getPassword().equals("")){
            System.out.println("pls enter user info");
        }
        else{
        System.out.println(" ***************user register*******************");
            
        }

    } 
    public void getUserLogin(DataInfo d){
        if(d.getEmail().equals("admin@gmail.com") && d.getPassword().equals("admin123")){
            System.out.println("* *******  user Login  *********");
        }

    }
    
}
