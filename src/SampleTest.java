import java.util.*;

public class SampleTest {

    public static String longestNiceSubstring(String s) {
        StringBuilder sb = new StringBuilder();

        int i = 0 ;
        int j = 1;
        int matched = 0;

        while( j < s.length() ){
            char ch = s.charAt(i);
            char chNext = s.charAt(j);
            if((ch >= 65 && ch <= 90))
                ch = (char) (ch + 32);
            if(chNext >= 65 && chNext <= 90)
                chNext = (char) (chNext + 32);

            if( ch == chNext ){
                if(matched == 0 ){
                    sb.append(s.charAt(i));
                }
                sb.append(s.charAt(j));
                matched++;
            }
            else{
                matched = 0 ;
            }
            i++;
            j++;
        }

        sb.toString().substring(j-2,j);
       String ss = "adasd";
       ss  = ss + 'a';
        return sb.toString();



    }

    public static void main(String[] args) {
        System.out.println(longestNiceSubstring("Bb"));
    }

    private static void testMain(){

        Map <Character,Integer> map = new HashMap<>();
        map.put('a',1);
        map.put('b',2);

        map.remove('a');
    }

}

