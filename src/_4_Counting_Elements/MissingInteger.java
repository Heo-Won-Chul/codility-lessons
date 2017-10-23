package _4_Counting_Elements;

public class MissingInteger {

	public static void main(String [] args) {
		System.out.println(solution(new int[]{1, 3, 2, 1, 6, 4}));

		System.out.println(solution(new int[]{-1, -3, 5}));

		System.out.println(solution(new int[]{1, 2, 3, 4}));

		System.out.println(solution(new int[]{-1, -3}));
	}

	private static int solution(int[] A) {
		int length = A.length + 2;
		boolean [] array = new boolean[length];

		for (int number : A) {
			if (number > 0 && length >= number) {
				array[number] = true;
			}
		}

		for (int i = 1; i < length; i++) {
			if (!array[i]) {

				return i;
			}
		}

		return 1;
	}
}
