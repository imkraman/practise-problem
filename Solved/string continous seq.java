//LeetCode ques: 229

import java.util.*;

public class Main {
    public static void main(String[] args) {
      int[] nums = {0,1,2,4,5,7};
      
      int n = nums.length;
      StringBuilder sb = new StringBuilder();
      List<String> list = new ArrayList<>();

      

      for(int i=0; i<n; i++){
          int count = 0;
          int update = nums[i];
          int j;
          for( j=i+1; j<n; j++){
              if(nums[j] == update+1 ){
                  update = nums[j];
                  count++;
                  
              }else{
                  break;
              }
          }

          if(count == 0){
              sb.append("\"");
              sb.append(nums[i]);
              sb.append("\"");
          }else{
              sb.append("\"");
              sb.append(nums[i]);
              sb.append("->");
              sb.append(update);
              sb.append("\"");
          }

          i = j-1;
      }
        
        System.out.println(sb.toString() );
  }
}

/* Here for leetcode solution i used this approach
    else{
        StringBuilder sb = new StringBuilder();
        //sb.append("\"");
        sb.append(nums[i]);
        sb.append("->");
        sb.append(update);
        //sb.append("\"");

        list.add(sb.toString() );
    }
    
    -----------------------------
    
    //sb.append("\"") : ← regarding this
    
    / is the forward slash character, and 
    \ is the backslash character.
    the backslash character is also used as an escape character.
    This means that when it appears before certain characters or sequences,
    it modifies the interpretation of those characters or sequences.
    
*/