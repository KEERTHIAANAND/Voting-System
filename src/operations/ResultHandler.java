package operations;
import domain.Candidate; //candidate class
import java.util.List;

//Result handling class
public class ResultHandler {
    public void results(List<Candidate> candidates){ //displaying results
        System.out.println("\n RESULTS:");
        for(Candidate c : candidates){
            System.out.println(c.getName()+" -> " + c.getVotes()+" votes");
        }
    }
}
