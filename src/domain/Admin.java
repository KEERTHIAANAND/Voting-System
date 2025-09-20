package domain;

//Admin class
public class Admin extends User{

    //constructor passes details to user class
    public Admin(String name, String password){
        super(name, password, "Admin"); // role - admin
    }
}