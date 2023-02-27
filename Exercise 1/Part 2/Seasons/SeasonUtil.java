import java.util.ArrayList;
import java.util.Arrays;

public class SeasonUtil {
    public static final Season[] SEASONS = Season.values();
    public static void sortSeasonable(Comparable[] seasonables) {
        Arrays.sort(seasonables);
    }

    static String reportAll(Seasonable[] seasonables) {
        StringBuilder result = new StringBuilder();
        for (Seasonable seasonable:seasonables)
            result.append(seasonable.toString());

        return result.toString();
    }
}
