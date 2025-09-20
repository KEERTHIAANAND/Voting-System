package domain;

//Voter class
public class Voter extends User{

    //defaultly the user doesn't vote state
    private boolean voted = false;

    //constructor to initialize voter details with user role
    public Voter(String name, String password){
        super(name, password, "User");
    }

    //checking the voting state of user
    public boolean voted(){
        return voted;
    }

    //marking the voted state
    public void setvoted(boolean voted){
        this.voted = voted;
    }
}