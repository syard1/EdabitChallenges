// The Atbash cipher is an encryption method in which each letter of a word is replaced with its "mirror" letter in the alphabet: A <=> Z; B <=> Y; C <=> X; etc.
// // Create a function that takes a string and applies the Atbash cipher to it.
// Ex:
// atbash("apple") ➞ "zkkov"
// atbash("Hello world!") ➞ "Svool dliow!"
// atbash("Christmas is the 25th of December") ➞ "Xsirhgnzh rh gsv 25gs lu Wvxvnyvi"

package VeryHardChallenges;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AtbashCipher {

    public static void main(String[] args) {
    // atbash("Christmas is the 25th of December");
    atbash("Hello world!");
    }


    public static void atbash(String s){
        
        IntStream.rangeClosed(0,s.length()-1).mapToObj(i->{
            if((s.charAt(i)>= 'A' && s.charAt(i)<='Z'  ) ||( s.charAt(i)<='z' && s.charAt(i)>='a')){
                 return getChar(s.charAt(i));
            }
                          return s.charAt(i);

        }).forEach(i-> System.out.print(i));


    }

    public static  Character getChar(char c){
        ArrayList<Character> alphabetLowCharacters =(ArrayList<Character>) IntStream.rangeClosed(0, 25)
        .mapToObj(i -> (char) ('a' + i))
        .collect(Collectors.toList());      

            if(c>='a' &&'c'<='z')
             return ((char) ('z'- alphabetLowCharacters.indexOf(c)));
           
        ArrayList<Character> alphabetUppCharacters =(ArrayList<Character>) IntStream.rangeClosed(0, 25)
        .mapToObj(i -> (char) ('A' + i))
        .collect(Collectors.toList());  
             return ((char) ('Z'- alphabetUppCharacters.indexOf(c)));
    }   

    
}
