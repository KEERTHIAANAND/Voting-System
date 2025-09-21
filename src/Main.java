import domain.*;
import operations.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        AuthHandler auth = new AuthHandler();
        OTPHandler otpHandler = new OTPHandler();
        VotingHandler vote = new VotingHandler();
        ResultHandler res = new ResultHandler();

        Admin admin = new Admin("admin", "admin123");
        Voter user1 = new Voter("user1", "pass1");
        Voter user2 = new Voter("user2", "pass2");
        
        auth.register(admin);
        auth.register(user1);
        auth.register(user2);

        System.out.println("Welcome to Voting System");
        System.out.print("Enter UserName: ");
        String user_name = sc.nextLine();
        System.out.print("Enter password: ");
        String password = sc.nextLine();

        User logIn = auth.login(user_name, password);
        if(logIn == null){
            System.out.println("Invalid credentials");
            return;
        }

        String otp = otpHandler.otp();
        System.out.println("OTP sent: "+otp);
        System.out.print("Enter OTP: ");
        String enterOTP = sc.nextLine();

        if(!otpHandler.verifyOtp(enterOTP)){
            System.out.println("Verification failed!");
            return;
        }

        System.out.println("Login successful!");

        if(logIn instanceof Admin){
            System.out.println("Admin Menu: ");
            res.results(vote.getCandidate());
        }
        else if(logIn instanceof Voter){
            Voter voter = (Voter) logIn;
            System.out.println("Voting Menu: ");
            vote.displayCandidates();
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            vote.vote(voter, choice);
        }
    }    
}
