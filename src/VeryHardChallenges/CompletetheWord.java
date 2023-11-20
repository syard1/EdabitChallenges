// An input string can be completed if additional letters can be added and no letters need to be taken away to match the word. Furthermore, the order of the letters in the input string must be the same as the order of letters in the final word.
// Create a function that, given an input string, determines if the word can be completed.
// Ex:
// canComplete("butl", "beautiful") ➞ true
// // We can add "ea" between "b" and "u", and "ifu" between "t" and "l".
// canComplete("butlz", "beautiful") ➞ false
// // "z" does not exist in the word beautiful.
// canComplete("tulb", "beautiful") ➞ false
// // Although "t", "u", "l" and "b" all exist in "beautiful", they are incorrectly ordered.
// canComplete("bbutl", "beautiful") ➞ false
// Too many "b"s, beautiful has only 1.
package VeryHardChallenges;

public class CompletetheWord {
    public static void main(String[] args) {
        System.out.println(canCompleted("butlz", "beautiful"));
        System.out.println(canCompleted("tulb", "beautiful"));
        System.out.println(canCompleted("sing", "something"));
    }


    public static boolean canCompleted(String s, String str){

        int count =0;
        int length =0;
        for(int i=0; i<s.length(); i++){

            while(count<str.length()){

                if(s.charAt(i) == str.charAt(count)){
                    length++;
                    count++;
                    break;
                
                }
                count++;
            }
            
        }
        if(length != s.length()){
            return false;
        }
        return true;
    }
}
