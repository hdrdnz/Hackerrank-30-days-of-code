import java.util.*;

class Calculator{
    public Integer power(int a, int n) throws Exception {
        if(n<0 || a<0){
            throw new Exception("n and p should be non-negative");
        }
        return (int)(Math.pow(a,n));
    }
}

class Solution{

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {

            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int  ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
