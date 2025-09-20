package operations;
import domain.User; //user class from domain 
import java.util.*;

//Handling registration
public class AuthHandler {
    private Map<String, User> users = new HashMap<>(); //storing all users

    //new user
    public void register(User user){
        users.put(user.getUserName(), user);
    }

    //login
    public User login(String user_name, String password){
        if(users.containsKey(user_name)){
            User u = users.get(user_name);
            if(u.getPassword().equals(password))
                return u;
        }
        return null;
    }
}
