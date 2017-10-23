package _4_Counting_Elements;

// ★★★★★★★★
public class FrogRiverOne {

	public static void main(String [] args) {
		System.out.println(solution(5, new int[]{1, 3, 1, 4, 2, 3, 5, 4}));
	}

	private static int solution(int X, int [] A) {

		boolean[] check = new boolean[X];
		int count = 0;

		for (int i = 0; i < A.length; i++) {
			int element = A[i] - 1;

			if (!check[element]) {
				check[element] = true;
				count++;
				if (count == X) {
					return i;
				}
			}
		}

		return -1;
	}
}
