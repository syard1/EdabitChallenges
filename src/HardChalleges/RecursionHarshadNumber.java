// A number is said to be Harshad if it's exactly divisible by the sum of its digits. Create a function that determines whether a number is a Harshad or not.

// EX:
// isHarshad(75) ➞ false
// // 7 + 5 = 12
// // 75 is not exactly divisible by 12
// isHarshad(171) ➞ true
// // 1 + 7 + 1 = 9
// // 9 exactly divides 171
// isHarshad(481) ➞ true
// isHarshad(89) ➞ false
// isHarshad(516) ➞ true
// isHarshad(200) ➞ true


package HardChalleges;

import java.util.function.BiPredicate;
import java.util.function.IntPredicate;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class RecursionHarshadNumber {
    
    public static void main(String[] args) {

        int number = 171;

        int n =sumOfDigits(String.valueOf(number),String.valueOf(number).length());

        BiPredicate<Integer,Integer> prdict = (a,b)-> a%b ==0;
        System.out.println(prdict.test(number,n));

        
    }
    public static int sumOfDigits(String number, int length){

        if(length ==0){
            return 0;
        }
        else{
            return sumOfDigits(number, length - 1) + number.charAt(length - 1)-'0' ;      
          }

    }

}
