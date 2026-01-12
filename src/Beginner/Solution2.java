package Beginner;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution2 {
    public int[] solution(int num, int total) {
//       int[] answer=new int[num];
//       int start = (total - (num * (num - 1) / 2)) / num;
//
//       for(int i=0; i<num; i++){
//            answer[i]=start+i;
//       }
//
//       return answer;

        // Stream API
        int start = (total - (num * (num - 1) / 2)) / num;

        return IntStream.range(0, num)
                .map(i -> start + i)
                .toArray();
    }

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        int num = 3;
        int total = 12;

        System.out.println(Arrays.toString(solution2.solution(num, total)));
    }
}
