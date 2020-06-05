package InnerWorkByDi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Elio Yang on 2020/6/4.
 */
public class Fibonacci {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        long t1=System.currentTimeMillis();
        System.out.println(Fibonacci.solve1(n));
        System.out.println("Time "+(System.currentTimeMillis()-t1)+"ms");
        long t2=System.currentTimeMillis();
        System.out.println(Fibonacci.solve2(n));
        System.out.println("Time "+(System.currentTimeMillis()-t2)+"ms");
        long t3=System.currentTimeMillis();
        System.out.println(Fibonacci.solve3(n));
        System.out.println("Time "+(System.currentTimeMillis()-t3)+"ms");

    }
    public static int solve1(int n) {
        if (n <= 2) {
            return n;
        } else {
            return solve1(n - 1) + solve1(n - 2);
        }
    }

    static Map<Integer, Integer> map = new HashMap();

    public static int solve2(int n) {
        if (n <= 2) {
            return n;
        }
        else {
            if (map.containsKey(n)) {
                return map.get(n);
            }
            else {
                int m = solve2(n - 1) + solve2(n - 2);
                map.put(n, m);
                return m;
            }
        }
    }

    public static int solve3(int n) {
        if (n <= 2) {
            return n;
        }
        int val_1 = 0;
        int val_2 = 1;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = val_1 + val_2;
            val_1 = val_2;
            val_2 = sum;
        }
        return sum;

    }
}
