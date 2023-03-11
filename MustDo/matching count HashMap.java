/* LeetCode 229.
You are playing the Bulls and Cows game with your friend.

You write down a secret number and ask your friend to guess what the number is. 
When your friend makes a guess, you provide a hint with the following info:

The number of "bulls", which are digits in the guess that are in the correct position.
The number of "cows", which are digits in the guess that are in your secret number but 
are located in the wrong position. Specifically, the non-bull digits in the guess that 
could be rearranged such that they become bulls.

Given the secret number secret and your friend's guess guess, return the hint for 
your friend's guess.

The hint should be formatted as "xAyB", where x is the number of bulls and y is the 
number of cows. Note that both secret and guess may contain duplicate digits.
*/
import java.util.*;

public class Main {
  public static void main (String[] args) {
        // Your code here
        int[] one = {1,1,2,3};
        int[] two = {0,1,1,1};
        
        Map<Integer, Integer> secret = new TreeMap<>();
        Map<Integer, Integer> guess = new TreeMap<>();
        
        int A =0;
        for(int i=0; i< one.length; i++){
          int key1 = one[i];
          int key2 = two[i];
          
          if(key1 == key2){
            A++;
          }else{
            if( secret.containsKey(key1) ){
              int idx = secret.get(key1)+1;
              secret.put(key1, idx);
            }else{
              secret.put( key1, 1);
            }
            
            if( guess.containsKey(key2) ){
              int idx = guess.get(key2)+1;
              guess.put(key2, idx);
            }else{
              guess.put( key2, 1);
            }
          }
          
        }
        
        int ans =0;
        for(int key: secret.keySet() ){
          int count = secret.get(key);
          
          int catchs = 0;
          if(guess.containsKey(key) ){
            catchs = guess.get(key);
          }
          
          if(count <= catchs){
             ans += count;
          }else{
            ans += catchs;
          }
          
        }
          
        System.out.println( secret);
        System.out.println( guess );
        System.out.println( ans +" "+ A);
        
    }
}