package Lv1;

import java.util.stream.IntStream;

public class Solution6 {
    public int solution(int n) {
//        int answer=0;
//
//        while (n>0){
//            answer+=n%10;
//            n/=10;
//        }
//
//        return answer;

        // stream API1
//        return String.valueOf(n)
//                .chars()
//                .map(c->c-'0')
//                .sum();

        // stream API2
        return IntStream.iterate(n, i -> i > 0, i -> i / 10)
                .map(i -> i % 10)
                .sum();
    }

    public static void main(String[] args) {
        Solution6 solution6 = new Solution6();
        int n = 930211;

        System.out.println(solution6.solution(n));
    }
}
