import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.jar.JarOutputStream;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        String key="@gmail.com";
        List<String> list=new ArrayList<>();
        IntStream.range(0, N).forEach(NItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                String firstName = firstMultipleInput[0];

                String emailID = firstMultipleInput[1];
                 int m=emailID.length()-key.length();
                 int j=0;
              for(int i=0;i<=m;i++){
                   while(j<key.length() && key.charAt(j)==emailID.charAt(i+j)){
                       j=j+1;
                   }
                   if(j==key.length()) {
                       list.add(firstName);
                       break;
                   }
                   else j=0;
               }

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
         Collections.sort(list);
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }



        bufferedReader.close();
    }
}

