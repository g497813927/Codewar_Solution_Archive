public class Kata{
    public static int grow(int[] x){
        int result = 1;
        for (int item: x) {
            result *= item;
        }
        return result;
    }
}
