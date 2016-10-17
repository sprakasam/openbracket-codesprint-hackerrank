import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] a;
	
	public static int traverseCube (int n, int k) {
		int count = 0;
		for (int x=1; x <= (n-k+1); x++) {
			for (int y=1; y <= (n-k+1); y++) {
				for (int z=1; z <= (n-k+1); z++) {
					if (checkSubCube(x, y, z, k, n) == true)
						count++;
				}
			}
		}
		return count;
	}
	
	public static boolean checkSubCube(int x, int y, int z, int k, int n) {
		int max = 0;
		for (int tempx=0; tempx < k; tempx++) {
			for (int tempy=0; tempy < k; tempy++) {
				for (int tempz=0; tempz < k; tempz++) {
					if (valueA(x+tempx, y+tempy, z+tempz, n) > max) {
                        max = valueA(x+tempx, y+tempy, z+tempz, n);
                        if (max > k)
                            return false;
                    }
				}
			}
		}
		if (max == k)
			return true;
		else
			return false;
	}
	
	public static int valueA (int x, int y, int z, int n) {
		int temp = (x-1)*n*n + (y-1)*n + z;
		//System.out.println(temp-1);
		return a[temp-1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int queries = sc.nextInt();
		if (queries <= 5) {
            for (int q=0; q<queries; q++) {
			
			    int n = sc.nextInt();
                if (n>=1 && n<=50) {
                     int arrayLength = n*n*n;
			         a = new int[arrayLength];
			         for (int i=0; i<arrayLength; i++) {
				        a[i] = sc.nextInt();
			         }
			
			         for (int k=1; k<=n; k++) {
				        int count = traverseCube(n, k);
				        System.out.printf("%d ", count);
			         }
			
			         System.out.println();   
                } 
                 
		  }
        }
		
	}
}
