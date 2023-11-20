// Given a word, create a function which returns whether or not it's possible to create a palindrome by rearranging the letters in the word.
// Ex:
// isPalindromePossible("rearcac") ➞ true
// // You can make "racecar"
// isPalindromePossible("suhbeusheff") ➞ true
// // You can make "sfuehbheufs" (not a real word but still a palindrome)
// isPalindromePossible("palindrome") ➞ false
// It's impossible

package VeryHardChallenges;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PalindromicAnagrams {
    
    public static void main(String[] args) {
        
        System.out.println(isPalindromePossible("palindrome"));
        System.out.println(isPalindromePossible("rearcac")); //racecar
        System.out.println(isPalindromePossible("suhbeusheff")); //sfuehbheufs

    }

    public static boolean isPalindromePossible(String str){

         Map<Character, Long> charCountMap = IntStream.rangeClosed(0, str.length() - 1)
            .mapToObj(i -> str.charAt(i))
            .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        int count =0;
            Set s = charCountMap.keySet();

            Iterator<Character> itr = s.iterator();
              while(itr.hasNext()){
                    char c = itr.next();
                if(charCountMap.get(c) ==1)
                count++;

                if(charCountMap.get(itr.next()) % 2 !=0 && count != 0){
                    return false;
                }
              }
        return true;
    }
}
