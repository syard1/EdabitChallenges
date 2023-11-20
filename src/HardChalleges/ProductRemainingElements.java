// Write a function that returns true if you can partition an array into one element and the rest, such that this element is equal to the product of all other elements excluding itself.

// EX:
// canPartition([2, 8, 4, 1]) ➞ true
// // 8 = 2 x 4 x 1
// canPartition([-1, -10, 1, -2, 20]) ➞ false
// canPartition([-1, -20, 5, -1, -2, 2]) ➞ true
package HardChalleges;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ProductRemainingElements {
    

    public static void main(String[] args) {
        
        // Integer[] vargu = {0, 0, 1};
        Integer[] vargu = {5, 5, 25, 100};
        System.out.println(isProdRemelement.test(vargu));
       
    }

    public static Predicate<Integer[]> isProdRemelement = vargu->{
           return IntStream.range(0,vargu.length).anyMatch(index->{
                int productExcluding= IntStream.range(0, vargu.length).filter(i-> i != index).map(i->vargu[i]).reduce(1,(e,g)->e*g);
               return vargu[index] == productExcluding;
            });

        };


    
}
