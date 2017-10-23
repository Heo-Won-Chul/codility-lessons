package _16_Greedy_Argorithms;

public class TieRopes {

	public static void main(String [] args) {
		System.out.println(solution(4, new int[]{1, 2, 3, 4, 1, 1, 3}));
	}

	public static int solution(int K, int[] A) {
		int count = 0;
		int length = 0;

		for (int number : A) {
			length += number;

			if (length >= K) {
				count++;
				length = 0;
			}
		}

		return count;
	}
}
