package operations;
import java.util.Random;

//OTP Generation
public class OTPHandler {
    private String otp;

    //using random class for generating otp
    public String otp(){
        Random rand = new Random();
        otp = String.valueOf(100000 + rand.nextInt(900000)); //6 digit otp
        return otp;
    }

    //verification of otp
    public boolean verifyOtp(String votp){
        return votp.equals(otp);
    }
}
