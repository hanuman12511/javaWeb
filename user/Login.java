package user;

import datainfo.DataInfo;
import userdao.UserController;

public class Login {
    public void userLogin(String email,String password){
         DataInfo in =new DataInfo();
    
        in.setEmail(email);
        in.setPassword(password);
        UserController uc=new UserController();
            uc.getUserLogin(in);

    }
    
}
