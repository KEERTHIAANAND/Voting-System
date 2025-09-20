package domain;

//details of party's candidate
public class Candidate {
    private String candidate_name;
    private int votes; //received count of votes

    public Candidate(String name){
        this.candidate_name = name;
        this.votes = 0; //initially 0
    }

    public String getName(){
        return candidate_name;
    }

    public int getVotes(){
        return votes;
    }

    //to increase vote count
    public void addVote(){
        votes++;
    }
}
