package _4_Counting_Elements;

import java.util.HashSet;
import java.util.Set;

public class MissingInteger {

	public int solution(int[] A) {
        Set<Integer> set = new HashSet<>(A.length);
        for (int num : A) {
            if (num > 0) {
                set.add(num);
            }
        }

        for (int i = 1; i < 1_000_000; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }

        throw new IllegalArgumentException("error");
    }

    public static void main(String[] args) {
        MissingInteger solution = new MissingInteger();
        System.out.println(solution.solution(new int[] { -1, -3 }));
        // 1
        System.out.println(solution.solution(new int[] { 3, 2, 1, 5, 6 }));
        // 4
        System.out.println(solution.solution(new int[] { -1, 1, 2 }));
        // 3
    }
}
