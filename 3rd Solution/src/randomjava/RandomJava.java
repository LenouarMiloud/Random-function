package randomjava;
import java.util.Random;
/**
 *
 * @author ANONYME
 */

public class RandomJava {

    public static void main(String[] args) {
        // TODO code application logic here
    //obtaine the random number between 0 and 16 by using the Math Librarie
        
        // whene we use random we can only obtain an int number by casting the double result
        int number = (int)(Math.random()* 15+1) ;
        
        System.out.println(number);
        
    }
    
}
