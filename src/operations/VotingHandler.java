package operations;
import domain.Candidate; //candidate class
import domain.Voter; // voter class
import java.util.*;

public class VotingHandler {
    private List<Candidate> candidates = new ArrayList<>(); //candidates list

    //constructor to initialize candidates 
    public VotingHandler(){
        candidates.add(new Candidate("SAM"));
        candidates.add(new Candidate("RAHUL"));
        candidates.add(new Candidate("SINGH"));
    }

    //candidates list
    public void displayCandidates(){
        for(int i =0;i<candidates.size(); i++){
            System.out.println((i+1) + ". "+candidates.get(i).getName()); //prints candidate names
        }
    }

    //voting for candidates
    public void vote(Voter user, int choice){
        if(!user.voted() && choice > 0 && choice <= candidates.size()){
            candidates.get(choice - 1).addVote();
            user.setvoted(true); //marking the voter as voted
            System.out.println("VOTED SUCCESSFULLY");
        }
        else{
            System.out.println("Invalid choice or you have already voted."); //exception handling

        }
    }

    public List<Candidate> getCandidate(){
        return candidates;
    }
}


