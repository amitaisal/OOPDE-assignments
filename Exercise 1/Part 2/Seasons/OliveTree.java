public class OliveTree extends Tree {

    /**
     * Constructor that initializes an OliveTree object with the given height and season,
     * and sets the leavesColor to green.
     * @param height the height of the tree
     * @param season the current season of the tree
     */
    OliveTree(int height, Season season) {
        super(height, season, Color.GREEN);
    }

    /**
     * Returns a string representation of the OliveTree object, including the height, color of the leaves,
     * and whether it gives fruit in the fall.
     * @return a string representation of the OliveTree object
     */
    @Override
    public String toString() {
        String str = "";
        if (getCurrentSeason() == Season.FALL)
            str += "I give fruit. ";

        return "Olive tree. " + str +
                "My height is: " + height +
                " and my color is: " + leavesColor + '\n';
    }

    /**
     * Changes the current season of the OliveTree object and updates the height of the tree accordingly.
     */
    @Override
    public void changeSeason() {
        super.changeSeason();
        changeHeight();

    }

    /**
     * Changes the height of the OliveTree object depending on the current season.
     */
    private void changeHeight() {
        if (super.getCurrentSeason() == Season.WINTER)
            height = height + 5;
        else if (super.getCurrentSeason() == Season.SPRING)
            height = height + 10;
        else if (super.getCurrentSeason() == Season.SUMMER)
            height = height + 10;
        else if (super.getCurrentSeason() == Season.FALL)
            height = height + 5;
    }
}
