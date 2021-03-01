public class Kata {
    public static int[] digitize(long n) {
        String input = String.valueOf(n);
        char[] digits = input.toCharArray();
        int[] result = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            result[i] = Integer.parseInt(String.valueOf(digits[digits.length - 1 - i]));
        }
        return result;
    }
}
