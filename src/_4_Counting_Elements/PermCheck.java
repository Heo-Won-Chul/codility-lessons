package _4_Counting_Elements;

public class PermCheck {

	public static void main(String [] args) {
		System.out.println(solution(new int[]{1, 2, 4, 3}));
	}

	private static int solution(int [] A) {
		int length = A.length + 1;
		boolean [] array = new boolean[length];

		for (int number : A) {
			if (length > number) {
				array[number] = true;
			}
		}

		for (int i = 1; i < length; i++) {
			if (!array[i]) {
				return 0;
			}
		}
		return 1;
	}
}
