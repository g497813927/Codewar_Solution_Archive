public class Kata{
    public static double find_average(int[] array){
        if (array.length == 0) {
            return 0;
        }
        double sum = 0;
        for (int item: array) {
            sum += item;
        }
        return sum / array.length;
    }
}
