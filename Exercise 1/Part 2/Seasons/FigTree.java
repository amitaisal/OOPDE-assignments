public class FigTree extends Tree {

    /**
     * A constructor. It initializes the height, season, and color of the FigTree.
     * @param height the height of the FigTree
     * @param season the season the FigTree is in
     */
    FigTree(int height, Season season) {
        super(height, season, null);
        setColor();
    }

    /**
     * Returns a string representation of the tree.
     * @return A string representation of the tree.
     */
    @Override
    public String toString() {
        String str = "";
        if (getCurrentSeason() == Season.SUMMER)
            str += "I give fruit. ";
        String color = leavesColor == null ? "I have no leaves" : "my color is: " + leavesColor.toString();

        return "Fig tree. " + str +
                "My height is: " + height +
                " and " + color + '\n';
    }

    /**
     * This method changes the season of the FigTree and updates its color and height accordingly.
     */
    @Override
    public void changeSeason() {
        super.changeSeason();
        setColor();
        changeHeight();
    }

    /**
     * This method sets the leaves color of the FigTree depending on the current season.
     */
    private void setColor() {
        if (super.getCurrentSeason() == Season.WINTER)
            leavesColor = null;
        else if (super.getCurrentSeason() == Season.SPRING)
            leavesColor = Color.GREEN;
        else if (super.getCurrentSeason() == Season.SUMMER)
            leavesColor = Color.GREEN;
        else if (super.getCurrentSeason() == Season.FALL)
            leavesColor = Color.YELLOW;
    }

    /**
     * This method changes the height of the FigTree depending on the current season.
     */
    private void changeHeight() {
        if (super.getCurrentSeason() == Season.WINTER)
            height = height + 20;
        else if (super.getCurrentSeason() == Season.SPRING)
            height = height + 30;
        else if (super.getCurrentSeason() == Season.SUMMER)
            height = height + 30;
        else if (super.getCurrentSeason() == Season.FALL)
            height = height + 20;
    }
}
