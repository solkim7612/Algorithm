package Lv1;

import java.util.Map;
import java.util.function.BiPredicate;
import java.util.stream.Stream;

public class Solution9 {
    public int solution(String ineq, String eq, int n, int m) {
//        boolean ans=false;
//        if(eq.equals("=")) {
//            if(ineq.equals(">")) ans=n>=m;
//            else ans=n<=m;
//        } else {
//            if(ineq.equals(">")) ans=n>m;
//            else ans=n<m;
//        }
//
//        return ans? 1:0;

        // stream API
        Map<String, BiPredicate<Integer, Integer>> functions = Map.of(
                ">=", (a, b) -> a >= b,
                "<=", (a, b) -> a <= b,
                ">!", (a, b) -> a > b,
                "<!", (a, b) -> a < b
        );

        return Stream.of(ineq + eq)
                .map(functions::get)
                .map(func -> func.test(n, m))
                .mapToInt(result -> result ? 1 : 0)
                .findFirst()
                .orElse(0);

    }

    public static void main(String[] args) {
        Solution9 solution9 = new Solution9();
        String ineq = "<";
        String eq = "=";
        int n = 20;
        int m = 50;

        System.out.println(solution9.solution(ineq, eq, n, m));
    }
}
