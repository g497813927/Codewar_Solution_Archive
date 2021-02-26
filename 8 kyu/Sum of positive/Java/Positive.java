public class Positive{
    public static int sum(int[] arr){
        int sum = 0;
        for (int item: arr) {
            if (item > 0) {
                sum += item;
            }
        }
        return sum;
    }

}
