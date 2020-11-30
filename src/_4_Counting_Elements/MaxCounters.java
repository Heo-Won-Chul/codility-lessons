package _4_Counting_Elements;

import java.util.Arrays;

class MaxCounters {
    public int[] solution(int N, int[] A) {
        int[] array = new int[N];
        int max = 0;
        int apply = 0;
        for (int num : A) {
            if (num >= 1 && num <= N) {
                final int index = num - 1;
                if (apply > array[index]) {
                    array[index] = apply;
                }
                array[index]++;
                max = Math.max(max, array[index]);
            } else if (num == N + 1) {
                apply = max;
            }
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.max(array[i], apply);
        }

        return array;
    }

    public static void main(String[] args) {
        MaxCounters solution = new MaxCounters();
        System.out.println(Arrays.toString(solution.solution(5, new int[] { 3, 4, 4, 6, 1, 4, 4 })));
        // {3, 2, 2, 4, 2}
        System.out.println(Arrays.toString(solution.solution(5, new int[] { 3, 4, 4, 6, 4, 4, 4 })));
        // {2, 2, 2, 5, 2}
        System.out.println(Arrays.toString(solution.solution(5, new int[] { 3, 4, 4, 4, 4, 4, 6 })));
        // {5, 5, 5, 5, 5}
        System.out.println(Arrays.toString(solution.solution(5, new int[] { 6, 6, 6, 6, 6, 6, 6 })));
        // {0, 0, 0, 0, 0}
        System.out.println(Arrays.toString(solution.solution(5, new int[] { 3, 4, 4, 6, 3, 4, 4 })));
        // {2, 2, 3, 4, 2}
        System.out.println(Arrays.toString(solution.solution(5, new int[] { 4, 6, 3, 3, 3, 1, 2 })));
        // {2, 2, 4, 1, 1}
    }
}
