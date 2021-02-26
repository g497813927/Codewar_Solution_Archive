public class Calculate {
    public static String bmi(double weight, double height) {
        double result = weight / (height * height);
        if (result > 30) {
            return "Obese";
        } else if (result > 25) {
            return "Overweight";
        } else if (result > 18.5) {
            return "Normal";
        }
        return "Underweight";
    }
}
