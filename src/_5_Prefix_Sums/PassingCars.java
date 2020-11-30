package _5_Prefix_Sums;

class PassingCars {
    public int solution(int[] A) {
        int accumulate = 0;
        int result = 0;
        for (int num : A) {
            if (num == 0) {
                accumulate++;
            } else {
                result += accumulate;
            }
        }

        if (result > 1_000_000_000) {
            return -1;
        } else {
            return result;
        }
    }

    public static void main(String[] args) {
        PassingCars solution = new PassingCars();
        System.out.println(solution.solution(new int[] { 0, 1, 0, 1, 1 }));
        // 5
        System.out.println(solution.solution(new int[] { 1, 0, 1, 0, 0 }));
        // 1
    }
}
