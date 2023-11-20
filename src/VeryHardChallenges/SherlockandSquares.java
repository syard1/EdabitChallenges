// Watson likes to challenge Sherlock's math ability. He will provide a starting and ending value describing a range of integers. Sherlock must determine the number of square integers within that range, inclusive of the endpoints (note that a square integer is an integer which is the square of an integer, e.g. 1, 4, 9, 16, 25, 36, 49).
// For example, the range is a=24 and b=49, inclusive. There are three square integers in the range: 25, 36 and 49.
// Complete the squares function that returns an integer representing the number of square integers in the inclusive range from a to b.
// EX:
// squares(3, 9) ➞ 2
// squares(17, 24) ➞ 0
// squares(1, 1000000000) ➞ 31622
package VeryHardChallenges;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SherlockandSquares {
        
        public static void main(String[] args) {
           System.out.println(squares(1, 1000000000)); 
        }


    public static int squares(int a, int b){

        int floor = (int)Math.sqrt(a);
        int ceil = (int)Math.sqrt(b)+1;
       return (int)IntStream.range(floor, ceil).filter(i-> i*i>=a && i*i<=b).count();
    }}