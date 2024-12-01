import java.util.random.RandomGenerator;

public class RandomOtpJava17 {

    public static void main(String[] args) {
        var random = RandomGenerator.getDefault();
        random.ints(5,1000,9999)
                .forEach(num->{
                    System.out.println(" five random otp of four digit " + num);});
    }

}
