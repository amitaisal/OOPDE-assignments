public class Bear extends Animal {

    /**
     * A constructor for the Bear class, It initializes the weight, season, and color of the bear.
     * @param weight The weight of the bear.
     * @param season The season the bear is in.
     */
    Bear(int weight, Season season) {
        super(weight, season, Color.BROWN);
    }

    /**
     * Returns a string representation of the bear, including its weight and color.
     * If the bear is in winter, it adds a sleeping message to the string.
     * @return A string representation of the bear.
     */
    @Override
    public String toString() {
        String str = "";
        if (getCurrentSeason() == Season.WINTER) {
            str += "I am sleeping. ";
        }
        return "Bear. " + str +
                "My weight is: " + weight +
                " and my color is: " + color + '\n';
    }

    /**
     * Changes the season of the bear and updates its weight based on the season.
     */
    @Override
    public void changeSeason() {
        super.changeSeason();
        if (super.getCurrentSeason() == Season.WINTER) {
            weight = (int)Math.round(weight * 0.8);
        } else if (super.getCurrentSeason() == Season.SPRING) {
            weight = (int)Math.round(weight * 0.75);
        } else if (super.getCurrentSeason() == Season.SUMMER) {
            weight = (int)Math.round(weight + weight / 3.);
        } else if (super.getCurrentSeason() == Season.FALL) {
            weight = (int)Math.round(weight * 1.25);
        }
    }
}
