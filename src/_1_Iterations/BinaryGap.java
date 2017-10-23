package _1_Iterations;

public class BinaryGap {

	public static void main(String [] args) {
		System.out.println(solution(6));
	}

	public static int solution(int N) {
		int maxGapCount = 0;
		int gapCount = 0;
		int temp = 0;

		do {
			temp = N % 2;
			N /= 2;
		} while (temp == 0);

		while (N != 0) {
			temp = N % 2;
			N /= 2;

			if (temp == 0) {
				gapCount++;
			} else {
				maxGapCount = Math.max(maxGapCount, gapCount);
				gapCount = 0;
			}
		}

		return maxGapCount;
	}
}
