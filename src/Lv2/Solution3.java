package Lv2;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution3 {
    public String[] solution(String my_str, int n) {
//        String[] answer=new String[
//                my_str.length()%n==0? my_str.length()/n: (my_str.length()/n)+1
//                ];
//
//        for(int i=0; i<answer.length; i++){
//            if(i==answer.length-1){
//                answer[i]=my_str.substring(i*n);
//            } else {
//                answer[i]=my_str.substring(i*n, (i+1)*n);
//            }
//        }
//
//        return answer;

        // stream API
        return IntStream.iterate(0, i -> i < my_str.length(), i -> i + n)
                .mapToObj(i -> my_str.substring(i, Math.min(i + n, my_str.length())))
                .toArray(String[]::new);
    }

    public static void main(String[] args) {
        String my_str = "abc1Addfggg4556b";
        int n = 6;
        Solution3 solution3 = new Solution3();

        System.out.println(Arrays.toString(solution3.solution(my_str, n)));
    }
}
