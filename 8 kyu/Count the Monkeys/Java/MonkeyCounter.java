public class MonkeyCounter {
    public static int[] monkeyCount(final int n) {
        int[] result = new int[n];
        for (int i = 1; i <= n; i++) {
            result[i - 1] = i;
        }
        return result;
    }
}
