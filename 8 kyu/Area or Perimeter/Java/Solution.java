public class Solution {
    public static int areaOrPerimeter (int l, int w) {
        return l == w ? (l * l) : (l + w) * 2;
    }
}
