package Lv1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution5 {
    public int solution(int[] num_list) {
        // 방법 1
//        String odd = "";
//        String even = "";
//        for (int i = 0; i < num_list.length; i++) {
//            if (num_list[i] % 2 == 1) odd += num_list[i];
//            else even += num_list[i];
//        }
//
//        return Integer.parseInt(odd) + Integer.parseInt(even);

        // 방법 2
//        int odd = 0;
//        int even = 0;
//
//        for (int i = 0; i < num_list.length; i++) {
//            if (num_list[i] % 2 == 1) {
//                odd *= 10;
//                odd += num_list[i];
//            } else {
//                even *= 10;
//                even += num_list[i];
//            }
//        }
//
//        return odd + even;

        //stream API 1
//        int odd = Integer.parseInt(Arrays.stream(num_list)
//                .filter(n -> n % 2 == 1)
//                .mapToObj(String::valueOf)
//                .collect(Collectors.joining()));
//
//        int even = Integer.parseInt(Arrays.stream(num_list)
//                .filter(n -> n % 2 == 0)
//                .mapToObj(String::valueOf)
//                .collect(Collectors.joining()));
//
//        return odd + even;

        //stream API 2
        int odd = Arrays.stream(num_list)
                .filter(n -> n % 2 == 1)
                .reduce(0, (acc, n) -> acc * 10 + n);

        int even = Arrays.stream(num_list)
                .filter(n -> n % 2 == 0)
                .reduce(0, (acc, n) -> acc * 10 + n);

        return odd + even;

    }

    public static void main(String[] args) {
        Solution5 solution5 = new Solution5();

        int[] num_list = {5, 7, 8, 3};

        System.out.println(solution5.solution(num_list));
    }
}
