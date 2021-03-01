import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Solution {

    public static String[] stringToArray(String s) {
        Scanner scanner = new Scanner(s);
        List<String> wordList = new ArrayList<>();
        while (scanner.hasNext()) {
            wordList.add(scanner.next());
        }
        String[] result = new String[wordList.size()];
        wordList.toArray(result);
        return result;
    }

}
