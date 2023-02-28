import java.util.*;
import java.util.stream.*;
/* In your case, the error is caused by the line import java.util.stream; in your code.
 This is because stream is not a class in the java.util package, but rather a 
 sub-package containing classes related to streams. To import the IntStream class, 
 you need to import java.util.stream.IntStream;
 */

public class Main {
    public static void main(String args[]) {
        int[] nums= {-1,-1,0,1,1,0};
        int n = nums.length;

        int presum = IntStream.of( nums ).sum();
        // for(int key: nums){
        //     presum += key;
        // }

        int sum = 0;
        int ans = 0;
        int i = 0;
        boolean flag = false;
        while( i < n){
            //System.out.println( sum +" "+ (presum-sum-nums[i] ) );
            /*here ↑
            Main.java:16: error: bad operand types for binary operator '-'
            so simply do this( sum +" "+ (presum-sum-nums[i]) ) & wallah;
            */
            if( sum == (presum-nums[i]-sum) ){
                ans = i;
                flag = true;
                break;
            }
            sum += nums[i];
            i++;
        }

        if(flag)
        System.out.println(ans);
        else
        System.out.println("-1");
    }
}