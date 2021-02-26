public class ZywOo {
    public static String warnTheSheep(String[] array) {
        int wolfIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals("wolf")) {
                wolfIndex = i;
            }
        }

        if (wolfIndex == array.length - 1) {
            return "Pls go away and stop eating my sheep";
        }
        return "Oi! Sheep number " + (array.length - wolfIndex - 1)
            + "! You are about to be eaten by a wolf!";
    }

}
