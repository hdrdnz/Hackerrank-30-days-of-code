import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
     Scanner scan=new Scanner(System.in);
     List<Integer> values=new ArrayList<>();
     int n=scan.nextInt();
     for(int i=1;i<=n;i++){
         values.add(scan.nextInt());
     }
     loop:for(int j=0;j<values.size();j++){
         if(values.get(j)==1 || values.get(j)==0) {
             System.out.println("Not prime");
             continue loop;
         }
         for(int i=2;i<values.get(j);i++){
             if(values.get(j)%i==0) {
                 System.out.println("Not prime");
                 continue loop;
             }

     }
     System.out.println("Prime");
     }
    }
}
 /*

  */