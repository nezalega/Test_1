package by.academy;

public class Lesson_2_4 {

    public static void main(String[] args) {
        int s = 3700;
        int sec;
        int m;
        int min, h;
        int hour;
        int d = 8;
        int day;
        int w;
        int week;

        sec = s % 60;  // будет 40
        m = (s - sec) / 60; // будет 61
        min = m % 60; // будет 1
        h = (m - min) / 60; // будет 1

        day = d%7; // будет 1
        w = (d - day); // будет 7
        //System.out.println(w);
        System.out.println(w + " недель " + day + " дней " + h + " часов " + min + " минут " + sec + " секунд");
       // System.out.println(h + " часов " + min + " минут " + sec + " секунд");
    }
}
