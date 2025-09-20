package operations;
import domain.Candidate;
import java.util.List;

public class ResultHandler {
    public void results(List<Candidate> candidates){
        System.out.println("\n RESULTS:");
        for(Candidate c : candidates){
            System.out.println(c.getName()+" -> " + c.getVotes()+" votes");
        }
    }
}
