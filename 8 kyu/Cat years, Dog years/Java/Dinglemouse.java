public class Dinglemouse {
    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int catYear = 15;
        int dogYear = 15;
        if (humanYears > 1) {
            catYear += 9;
            dogYear += 9;
        }
        if (humanYears > 2) {
            catYear += 4 * (humanYears - 2);
            dogYear += 5 * (humanYears - 2);
        }
        return new int[]{humanYears, catYear, dogYear};
    }
}
