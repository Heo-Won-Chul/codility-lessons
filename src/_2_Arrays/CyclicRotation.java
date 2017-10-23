package _2_Arrays;

import java.util.Arrays;

public class CyclicRotation {

	public static void main(String [] args) {
		System.out.print(Arrays.toString(solution(new int[]{}, 1)));
	}

	public static int[] solution(int[] A, int K) {
		if (A == null) {
			return null;
		}

		int length = A.length;
		if (length == 0 || K == 0) {
			return A;
		}

		int [] array = new int[length];

		K %= length;
		for (int i = 0; i < length; i++) {
			array[(i + K) % length] = A[i];
		}

		return array;
	}
}
