package _16_Greedy_Argorithms;

public class MaxNonoverlappingSegments {

	public static void main(String [] args) {
		System.out.println();
	}

	public static int solution(int[] A, int[] B) {
		int length = A.length;

		if (length == 0) {
			return 0;
		}

		int result = 0;
		int bestIndex = 0;

		for (int i = 1; i < length; i++) {
			if (A[i] > B[bestIndex]) {
				result++;
				bestIndex = i;
			}
		}

		return result + 1;
	}
}
