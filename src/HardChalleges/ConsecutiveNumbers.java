// Create a function that determines whether elements in an array can be re-arranged to form a consecutive list of numbers where each number appears exactly once.
// Ex:
// cons([5, 1, 4, 3, 2]) ➞ true
// // Can be re-arranged to form [1, 2, 3, 4, 5]
// cons([5, 1, 4, 3, 2, 8]) ➞ false
// cons([5, 6, 7, 8, 9, 9]) ➞ false
// 9 appears twice
package HardChalleges;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ConsecutiveNumbers {
    
    public static void main(String[] args) {
        
        Integer[] array = {5, 1, 4, 3, 2, 8};
        Arrays.sort(array);
        System.out.println(cons.test(array));
        
       
       
        //  for (Integer integer : array) {
        //     System.out.println(integer);
        // }

        printArrayElements.accept(array);

    }
  public static  Predicate<Integer[]> cons = i -> {
                Integer temp = i[0];
                int k=0;
               while( k<i.length ){

                if(i[k] != temp)
                return false;

                temp++;
                k++;
               }
               return true;
    };

    public static Consumer<Integer[]> printArrayElements = i-> Stream.of(i).forEach(System.out::println);
}
