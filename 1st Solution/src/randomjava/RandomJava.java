package randomjava;
import java.util.Random;
/**
 *
 * @author ANONYME
 */

public class RandomJava {

    public static void main(String[] args) {
        // TODO code application logic here
    // create en object of rando function
        Random rand = new Random();
    //obtaine the random number between 0 and 16
        int number = rand.nextInt(16);
        number+=1;
        System.out.println(number);
        
    }
    
}
