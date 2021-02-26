public class GrassHopper {
    public static char getGrade(int s1, int s2, int s3) {
        double average = (s1 + s2 + s3) / 3.0;
        if (average >= 90) {
            return 'A';
        } else if (average >= 80) {
            return 'B';
        } else if (average >= 70) {
            return 'C';
        } else if (average >= 60) {
            return 'D';
        }
        return 'F';
    }
}
