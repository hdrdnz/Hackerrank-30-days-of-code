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



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());
         int count=0;
         Integer gecici;
        // Write your code here
        for(int i=0;i<a.size();i++){
            for(int j=0;j<a.size()-1;j++){
                if(a.get(j)>a.get(j+1)){
                    count+=1;
                   gecici=a.get(j);
                   a.set(j,a.get(j+1));
                   a.set(j+1,gecici);

                }
            }
        }

        System.out.println("Array is sorted in "+ count +" swaps.");
        System.out.println("First Element:"+a.get(0));
        System.out.println("Last Element:"+a.get(a.size()-1));


        bufferedReader.close();
    }

}
