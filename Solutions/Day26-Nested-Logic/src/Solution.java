import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        String ifade=scan.nextLine();
        String[] verilen=ifade.split(" ");
        String ifade2=scan.nextLine();
        String[] alinan=ifade2.split(" ");


        if(alinan[2].equals(verilen[2])){
            if(Integer.parseInt(verilen[0])<=Integer.parseInt(alinan[0]) && Integer.parseInt(verilen[1])<=Integer.parseInt(alinan[1])){
                System.out.println(0);
            }
            else if(Integer.parseInt(verilen[1])==Integer.parseInt(alinan[1]) &&Integer.parseInt(verilen[0])>Integer.parseInt(alinan[0])){
                System.out.println(15*(Integer.parseInt(verilen[0])-Integer.parseInt(alinan[0])));
            }
        }


        if(Integer.parseInt(alinan[1]) <Integer.parseInt(verilen[1])){
            if(alinan[2].equals(verilen[2])){
                System.out.println(500*(Integer.parseInt(verilen[1])-Integer.parseInt(alinan[1])));
            }
        }

        if(Integer.parseInt(alinan[2]) !=Integer.parseInt(verilen[2])){
            if(Integer.parseInt(verilen[2]) <Integer.parseInt(alinan[2])){
                System.out.println(0);
            }
            else System.out.println(10000);
        }





    }


}