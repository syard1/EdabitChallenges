// Given a YouTube URL, extract the video ID and return it as a string.
// Ex:
// youtubeId("https://www.youtube.com/watch?v=XPEr1cArWRg") ➞ "XPEr1cArWRg"
// youtubeId("https://youtu.be/BCDEDi5gDPo") ➞ "BCDEDi5gDPo"
// youtubeId("https://youtube.com/watch?t=4m40s&v=vxP3bY-XxY4") ➞ "vxP3bY-XxY4"
package VeryHardChallenges;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class YouTubeVideoIDExtractor {
    
    public static void main(String[] args) {
     
        


        System.out.println(youtubeId("https://youtube.com/watch?t=4m40s&v=vxP3bY-XxY4"));
        System.out.println(youtubeId("https://youtu.be/BCDEDi5gDPo"));
        System.out.println(youtubeId("https://youtube.com/watch?t=4m40s&v=vxP3bY-XxY4"));

         
    }

    public static String youtubeId(String str){
        int t  = IntStream.rangeClosed(0, str.length()-1).map(i->str.length()-1-i).filter(i->Character.toString(str.charAt(i))
    .matches("[=/]")).findFirst().getAsInt(); 
    return str.substring(t+1);
    } 
}