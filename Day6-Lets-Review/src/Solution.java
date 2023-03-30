import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
        System.out.println("deger giriniz:");
        int n=scan.nextInt();
        String[] name=new String[n];

         for(int j=1;j<=n;j++){
             System.out.print("isim:");
             String s1=scan.next();
             name[j-1]=s1;
         }

        for(int i=0;i<name.length;i++){
            for(int j=0;j<name[i].length();j+=2){
                System.out.print(name[i].charAt(j));
            }
            System.out.print(" ");
            for(int j=1;j<name[i].length();j+=2){
                System.out.print(name[i].charAt(j));
            }
            System.out.println();

        }

    }
}
