/*
Problem Statement
Is it possible to get a sum of B when throwing a die with six faces 1, 2, …, 6 A times?
Input
The input consists of two space-separated integers.
A B

Constraints
1≤A≤100
1≤B≤1000
A and B are integers.
Output
If it is possible to get a sum of B, print Yes; otherwise, print No.
*/
import java.util.*;

public class Main {
  public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        int get = sc.nextInt();

        // if( get <= (time*6) && get != 0)
        // meri galti mai max lekar chal rha jabki min bhi possible handling
        if( get <= (time*6) && get >= time)
        System.out.print("Yes");
        else
        System.out.print("No");
    }
}