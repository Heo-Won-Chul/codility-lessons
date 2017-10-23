package _2_Arrays;


import java.util.HashMap;
import java.util.Map;

public class OddOccurrencesInArray {

	public static void main(String [] args) {
		System.out.println(solution(new int[]{9, 3, 9, 3, 9, 7, 9}));
	}

	public static int solution(int[] A) {
		int minNumber = Integer.MAX_VALUE;
		Map<Integer, Boolean> map = new HashMap<>();

		for (int number : A) {
			Boolean isNotPaired = map.get(number);

			if(Boolean.FALSE.equals(isNotPaired)) {
				map.put(number, true);
			} else {
				map.put(number, false);
			}
		}

		for(int number : map.keySet()) {
			if (Boolean.FALSE.equals(map.get(number))) {
				minNumber = Math.min(minNumber, number);
			}
		}

		return minNumber;
	}
}
