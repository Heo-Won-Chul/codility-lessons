package _3_Time_Complexity;

public class TapeEquilibrium {

	public static void main(String [] args) {
		System.out.println(solution(new int[]{3, 1, 2, 4, 3}));
	}

	public static int solution(int[] A) {
		int front = 0;
		int back = 0;
		int length = A.length;
		for(int i = 0; i < length; i++){
			back += A[i];
		}

		int minNumber = Integer.MAX_VALUE;
		for(int i = 1; i < length; i++){
			front += A[i-1];
			back -= A[i-1];
			minNumber = Math.min(minNumber, Math.abs(front - back));
		}

		return minNumber;
	}
}
