import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        int i=0,count=0,max=0,rem=0;
        while(n>0){
            rem=n%2;
            n=n/2;
            i++;
            if(rem==1){
                count++;
                if(count>max)
                    max=count;
            }
            else
                count=0;
        }
        System.out.print(max);
    }
}
