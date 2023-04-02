import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/* TASK
   Given an integer, n, perform the following conditional actions:

        If n is odd, print Weird
        If n is even and in the inclusive range of 2 to 5 , print Not Weird
        If n is even and in the inclusive range of 6 to 20, print Weird
        If n is even and greater than 20 , print Not Weird

*/
public class Main {

        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int N = Integer.parseInt(bufferedReader.readLine().trim());
            if(N%2==1) System.out.println("Weird");
            else{
                if(N>2 && N<5) System.out.println("Not Weird");
                else if(N>=6 && N<=20) System.out.println("Weird");

                else  System.out.println("Not Weird");        }

            bufferedReader.close();
        }
    }

