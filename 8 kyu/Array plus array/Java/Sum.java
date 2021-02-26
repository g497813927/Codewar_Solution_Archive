public class Sum {
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int sum = 0;
        for (int item: arr1) {
            sum += item;
        }
        for (int item: arr2) {
            sum += item;
        }
        return sum;
    }
}
