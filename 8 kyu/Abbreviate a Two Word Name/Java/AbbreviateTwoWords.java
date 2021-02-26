import java.util.Scanner;

public class AbbreviateTwoWords {
    public static String abbrevName(String name) {
        Scanner scanner = new Scanner(name);
        String abbreviate;
        abbreviate = scanner.next().substring(0,1).toUpperCase();
        abbreviate += ".";
        abbreviate += scanner.next().substring(0,1).toUpperCase();
        return abbreviate;
    }
}
