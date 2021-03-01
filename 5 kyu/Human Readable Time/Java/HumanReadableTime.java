public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        int hours = 0;
        int minutes = 0;
        String hourString;
        String minuteString;
        String secondString;

        while (seconds >= 3600) {
            hours++;
            seconds -= 3600;
        }

        while (seconds >= 60) {
            minutes++;
            seconds -= 60;
        }


        if (hours < 10) {
            hourString = "0" + hours;
        } else {
            hourString = Integer.toString(hours);
        }

        if (minutes < 10) {
            minuteString = "0" + minutes;
        } else {
            minuteString = Integer.toString(minutes);
        }

        if (seconds < 10) {
            secondString = "0" + seconds;
        } else {
            secondString = Integer.toString(seconds);
        }

        return hourString + ":" + minuteString + ":" + secondString;
    }
}
