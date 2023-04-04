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

        List<List<Integer>> arr = new ArrayList<>();
        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        int listSize = arr.size();
        int sum=Integer.MIN_VALUE;
        for(int y=0; (y+2)<listSize; y++){
            for (int x=0; (x+2)<listSize; x++) {
                int tempSumSatir = 0;
                for (int ii = x; ii < x + 3; ii++) {
                    tempSumSatir += arr.get(y).get(ii);
                    tempSumSatir += arr.get(y + 2).get(ii);
                }
                tempSumSatir += arr.get(y + 1).get(x + 1);
                if (tempSumSatir > sum) sum = tempSumSatir;
            }
        }
        System.out.println(sum);
        bufferedReader.close();
    }

}


