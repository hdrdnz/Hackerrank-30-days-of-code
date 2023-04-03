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
        List<Integer> binary = new ArrayList<Integer>();
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int a = 0;
        while (n > 0) {
            binary.add(0, n % 2);
            n = n / 2;
        }
        System.out.println(binary);
        int max = 0;
        for (int i : binary) {
            if (i == 1) {
                a += 1;
            } else {
                a = 0;
            }
            if (a > max) {
                max = a;
            }
        }

        System.out.println(max);
        bufferedReader.close();
    }

}


