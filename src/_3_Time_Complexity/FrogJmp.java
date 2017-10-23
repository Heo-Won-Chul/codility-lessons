package _3_Time_Complexity;

public class FrogJmp {

	public static void main(String [] args) {
		System.out.println(solution(10, 85, 30));
	}

	public static int solution(int X, int Y, int D) {
		// write your code in Java SE 8
		if (Y == X) {
			return 0;
		}

		Y -= X;
		if (Y % D == 0) {
			return Y / D;
		} else {
			return Y / D + 1;
		}
	}
}
