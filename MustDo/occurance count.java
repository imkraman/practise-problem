// Ques. count which element comes how many time using two loops
// and without using extra space.
import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int[] chars = {2,2,3,3,3,4,5,6,6};
      
      int i;
      for(i=0; i< chars.length; i++){
        System.out.print(i+"=1st_loop ");
        int len = 1;
        int j;
        for( j=i+1; j<chars.length; j++){
            if(chars[i] == chars[j] ){
                len++;
            }else{
              System.out.print(i+"=before&j:"+j);
                //i=j-1;
              System.out.print(" "+i+"=after ");
                break;
            }
        }
        i = j-1;
        System.out.println(chars[i]+" 2nd_loop& "+len);
      }
      
      //System.out.println("Hello, World!");
  }
}