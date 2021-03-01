import java.util.Random;

public class Ghost {
    private final static String[] COLORS = {"white", "yellow", "purple", "red"};
    private String color;

    public Ghost() {
        Random random = new Random();
        this.color = COLORS[random.nextInt(4)];
    }

    public String getColor() {
        return color;
    }
}
