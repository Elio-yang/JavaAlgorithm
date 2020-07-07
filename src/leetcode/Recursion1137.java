package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ELIO
 * @date 2020/07/07
 */
public class Recursion1137 {
    public static void main(String[] args) {
        int test1=25;
        System.out.println(solve(test1));
    }
    static Map<Integer,Integer> hashmap=new HashMap<>();
    public static int solve(int n){
        if (n<=1){
            return n;
        }
        if (n==2){
            return 1;
        }
        else {
            if (hashmap.containsKey(n)){
                return hashmap.get(n);
            }
            else {
                int ans=solve(n-3)+solve(n-2)+solve(n-1);
                hashmap.put(n,ans);
                return ans;
            }
        }

    }
}
