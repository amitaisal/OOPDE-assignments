public class Caribou extends Animal {

    /**
     * A constructor. It initializes the weight, season, and color of the caribou.
     * @param weight the weight of the caribou
     * @param season the season the caribou is in
     */
    Caribou(int weight, Season season) {
        super(weight, season, Color.BROWN);
        setColor();
    }

    /**
     * A method that returns a string describing the caribou.
     * @return a string describing the caribou
     */
    @Override
    public String toString() {
        String str = "";
        if(getCurrentSeason() == Season.WINTER)
            str += "I am migrating south. ";
        else if (getCurrentSeason() == Season.SUMMER)
            str += "I am migrating north. ";

        return "Caribou: " + str +
                "My weight is: " + weight +
                " and my color is: " + color + '\n';
    }

    /**
     * A method that changes the season of the caribou and updates its color accordingly.
     */
    @Override
    public void changeSeason() {
        super.changeSeason();
        setColor();
    }

    /**
     * A helper method that updates the color of the caribou based on its current season.
     */
    private void setColor() {
        if (super.getCurrentSeason() == Season.WINTER)
            color = Color.WHITE;
        else
            color = Color.BROWN;
    }
}
