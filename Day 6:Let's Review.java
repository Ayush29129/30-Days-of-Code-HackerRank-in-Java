import java.util.*;

public class Solution{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i=0,j=0,k=0,l=0;
        String[] str=new String[n];
        for(i=0;i<n;i++){
              str[i] = sc.next(); 

        }
        for(j=0;j<n;j++)
        {
            String string=str[j];
          char[] ch=string.toCharArray();
          for(k=0;k<string.length();k+=2){
              System.out.print(ch[k]);
          }
          System.out.print(" ");
          for(l=1;l<string.length();l+=2){
              System.out.print(ch[l]);
          }
          System.out.println();
          
        }
    }
}
