public class Kata {
    public static int[] countPositivesSumNegatives(int[] input) {
        int sumOfPositive = 0;
        int sumOfNegative = 0;
        if (input == null) {
            return new int[] {};
        }
        if (input.length == 0) {
            return new int[] {};
        }
        for (int item : input) {
            if (item > 0) {
                sumOfPositive++;
            } else {
                sumOfNegative += item;
            }
        }
        return new int[] {sumOfPositive, sumOfNegative};
    }
}
