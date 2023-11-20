// Create a function that checks if a given integer is exactly the factorial of an integer or not. true if it is, false otherwise.
// EX:
// isFactorial(2) ➞ true
// // 2 = 2 * 1 = 2!
// isFactorial(27) ➞ false
// isFactorial(24) ➞ true
// // 24 = 4 * 3 * 2 * 1 = 4!
package HardChalleges;
import java.util.function.IntPredicate;

public class IstheInputFactorialIntege {
    
    public static void main(String[] args) {
            System.out.println(isFactoriel.test(24));
            System.out.println(isFactoriel.test(3));

     
    }

     static  IntPredicate isFactoriel = a->{
            int i=1;
                int temp = 1;
                while(i<=a){
                    temp = i*temp;
                    if(temp ==a){
                    return true;
                    }
                    i++;
                }
                return false;
        };

     
}
