package domain;

// User Class
public class User{
    protected String user_name;
    protected String password;
    //(Role - Admin/User)
    protected String role;

    //initializing user details by using constructor
    public User(String name, String pass, String role){
        this.user_name = name; //username
        this.password = pass; //password
        this.role = role; //admin/user
    }

    public String getUserName(){
        return user_name;
    }

    public String getPassword(){
        return password;
    }

    public String getRole(){
        return role;
    }
}