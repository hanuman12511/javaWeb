package user;
import datainfo.*;
import userdao.*;
public class Register {
    
    public void userRegister(String name,String email,String password){
        DataInfo in =new DataInfo();
        in.setName(name);
        in.setEmail(email);
        in.setPassword(password);
        UserController uc=new UserController();
            uc.getUserRegister(in);

    } 
    
}
