package Lv1;

import java.util.Arrays;

public class Solution6 {
    public int[] solution(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            int x = arr[queries[i][0]];
            int y = arr[queries[i][1]];
            arr[queries[i][0]] = y;
            arr[queries[i][1]] = x;
        }

        return arr;
    }

    public static void main(String[] args) {
        Solution6 solution6 = new Solution6();

        int[] arr = {0, 1, 2, 3, 4};
        int[][] queries = {{0, 3}, {1, 2}, {1, 4}};

        System.out.println(Arrays.toString(solution6.solution(arr, queries)));
    }
}
