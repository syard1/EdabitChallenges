//Given a string, reverse all the words which have odd length. The even length words are not changed.

// EX:
// reverseOdd("Bananas") ➞ "sananaB"
// reverseOdd("One two three four") ➞ "enO owt eerht four"
// reverseOdd("Make sure uoy only esrever sdrow of ddo length")
// ➞ "Make sure you only reverse words of odd length"

package HardChalleges;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReversetheOddLengthWords {
    

    public static void main(String[] args) {
        
    
        String str = "One two three four";
        // String str = "Make sure uoy only esrever sdrow of ddo length";
        System.out.println(rev.apply(str));

    }

  
    public static Predicate<String> isOdd = s->{
        return Stream.of(s.split(" ")).mapToInt(t->t.length()).sum() %2 !=0;
    };

    public static Function<String,String> rev = s->{
        if(isOdd.test(s)){
       return Stream.of(s.split(" ")).map(str->reverse(str)).collect(Collectors.joining(" "));
    }
    else{
        return s;
    }
    };

    public static String reverse(String str){

        if(str.length()==1){
            return str;
        }
        else{
        return str.charAt(str.length()-1)+ reverse(str.substring(0,str.length()-1));
    }}
}
