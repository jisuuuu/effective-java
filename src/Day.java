import java.util.HashMap;
import java.util.Map;

public class Day {
    private static final Map<String, Day> days = new HashMap<>();

    static {
        days.put("mon", new Day("Monday"));
        days.put("tue", new Day("Tuesday"));
        days.put("wen", new Day("Wednesday"));
        days.put("thu", new Day("Thursday"));
        days.put("fri", new Day("Friday"));
        days.put("sat", new Day("Saturday"));
        days.put("sun", new Day("Sunday"));
    }

    public static Day from(String day) {
        return days.get(day);
    }

    private final String day;

    private Day(String day) {
        this.day = day;
    }

    public String getDay() {
        return day;
    }

    public static void main(String[] args) {
        Day day = Day.from("mon");
        System.out.println(day.getDay());
    }
}
