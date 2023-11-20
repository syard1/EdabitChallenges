// Given a positive integer n and if 1 plus 2 times n exactly divides 1 plus 2 raised to the power n, then n is said to be a Curzon number.
// Write a function that determines whether a number is a Curzon number or not.package HardChalleges;
// isCurzon(5) ➞ true
// // 2 ** 5 + 1 = 33
// // 2 * 5 + 1 = 11
// // 33 is a multiple of 11

// isCurzon(10) ➞ false
// // 2 ** 10 + 1 = 1025
// // 2 * 10 + 1 = 21
// // 1025 is not a multiple of 21

// isCurzon(14) ➞ true
// // 2 ** 14 + 1 = 16385
// // 2 * 14 + 1 = 29
// // 16385 is a multiple of 29

package HardChalleges;
import java.util.function.BiPredicate;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class CurzonNumbers {
    public static void main(String[] args) {
        
        isCurzon(14);
       
    }
    public static void isCurzon(int n){
        int x =  first.apply(n);
        int y = second.apply(n);
        System.out.println(third.test(x,y));
    }
    public static  IntFunction<Integer> first = n->(int)Math.pow(2, n)+1;
    public static IntFunction<Integer> second = n-> 2*n+1;
    public static BiPredicate<Integer,Integer> third = (a,b)-> a%b ==0;
}
