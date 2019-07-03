import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, sum, count=0;
        n = scan.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = scan.nextInt();
        }

        for(int i=0;i<n;i++){
            sum=a[i];
            if(sum <0){
                count++;
            }
            for(int j=i+1;j<n;j++){
                
                sum = sum+a[j];
                if(sum<0){
                    count++;
                    continue;
                } 
                else{
                    continue;
                }
            }
        }
    System.out.println(count);
    }
}

