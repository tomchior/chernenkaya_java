class Time {
    int minut;
    int hours;
}

public class ExperimentsWithTime {
    public static void main(String[] args) {
        Time m = new Time();
        Time h = new Time();
        m.minut = 10;
        h.hours = 2;

        System.out.println( h.hours + "hours" + " " + m.minut + "minuts");
    }
}
