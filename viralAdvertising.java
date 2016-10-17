import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int d = 1, n, m = 5, newDelegates, likes = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        while ((d < n+1) && (d > 0)) {
            newDelegates = (int) Math.floor(m/2);
            likes += newDelegates;
            m = 3 * newDelegates;
            d++;
        }
        
        System.out.println(likes);
    }
}
