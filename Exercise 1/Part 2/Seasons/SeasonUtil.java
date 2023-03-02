import java.util.Arrays;

public class SeasonUtil {

    public static final Season[] SEASONS = Season.values();

    /**
     * Sorts the input array in natural order.
     * @param seasonables The array of Comparable objects to be sorted.
     */
    public static void sortSeasonable(Comparable[] seasonables) {
        Arrays.sort(seasonables);
    }

    /**
     * Returns a string representation of the input array of Seasonable objects.
     * @param seasonables The array of Seasonable objects.
     * @return A string representation of the input array of Seasonable objects.
     */
    static String reportAll(Seasonable[] seasonables) {
        StringBuilder result = new StringBuilder();
        for (Seasonable seasonable:seasonables)
            result.append(seasonable.toString());

        return result.toString();
    }
}
