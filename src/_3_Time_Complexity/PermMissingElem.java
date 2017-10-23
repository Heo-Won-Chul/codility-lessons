package _3_Time_Complexity;

public class PermMissingElem {

	public static void main(String [] args) {
		System.out.println(solution(new int[] {2, 3, 1, 5}));
		System.out.println(solution(new int[] {1, 2, 3}));
		System.out.println(solution(new int[] {2, 3}));
	}

	public static int solution(int[] A) {
		int minNumber = 0;
		int length = A.length;
		boolean [] array = new boolean[length + 2];

		for (int i = 0; i < length; i++) {
			int number = A[i];
			if (number > 0) {
				array[number] = true;
			}
		}

		for(int i = 0; i < length + 2; i++) {
			if (!array[i]) {
				minNumber = i;
			}
		}

		return minNumber;
	}
}
