import java.util.*;

public class Main {
    public static void main(String args[]) {
        
      String s = "aacc";
      String t = "ccac";
        
      boolean flag = true;
      if (s.length() != t.length())
      flag = false;

      int[] count = new int[128];

      for (final char c : s.toCharArray())
      ++count[c];
      //moral of the story,jitna bhi count aaye kisi bhi element utna dafa bdhega
      
      
      for (final char c : t.toCharArray()){
      //ye neche wala statement utna dafa minus karega par hame us elem. se matlab
      //hai jo s me kam aur t m jyada aaya hai(length same hone k waujud).
      //such as s="zara" & t="zarr" 
      if ( --count[c] < 0)
        flag = false;
      }

      System.out.print( (flag)? "Yes": "No");
    }
}