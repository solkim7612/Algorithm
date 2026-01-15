package Lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution7 {
    public int[] solution(int[] arr, int[][] queries) {
//        int[] answer=new int[queries.length];
//
//        for (int i = 0; i < queries.length; i++) {
//            ArrayList<Integer> temp=new ArrayList<>();
//
//            int s = queries[i][0];
//            int e = queries[i][1];
//            int k = queries[i][2];
//
//            for(int j=s; j<=e; j++){
//                if(arr[j]>k) temp.add(arr[j]);
//            }
//            answer[i]=temp.isEmpty()? -1: Collections.min(temp);
//        }
//
//        return answer;

        // stream API
        return Arrays.stream(queries)
                .mapToInt(query -> {
                    int s = query[0];
                    int e = query[1];
                    int k = query[2];

                    return Arrays.stream(arr, s, e + 1)
                            .filter(value -> value > k)
                            .min()
                            .orElse(-1);
                })
                .toArray();
    }

    public static void main(String[] args) {
        Solution7 solution7 = new Solution7();

        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 2}, {0, 3, 2}, {0, 2, 2}};

        System.out.println(Arrays.toString(solution7.solution(arr, queries)));
    }
}
