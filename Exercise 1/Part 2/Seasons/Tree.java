public abstract class Tree implements Comparable, Seasonable {

    // The height of the tree.
    protected int height;

    // The season the tree is currently in.
    protected Season season;

    // The color of the leaves on the tree.
    protected Color leavesColor;

    /**
     * A constructor for the Tree class, Initializes the height, season, and leavesColor of the tree.
     * @param height The height of the tree.
     * @param season The season the tree is in.
     * @param leavesColor The color of the leaves on the tree.
     */
    Tree(int height, Season season, Color leavesColor){
        this.height = height;
        this.season = season;
        this.leavesColor = leavesColor;
    }

    /**
     * Gets the current season of the tree.
     * @return The current season of the tree.
     */
    @Override
    public Season getCurrentSeason() {
        return season;
    }

    /**
     * Compares the height of the tree to another object.
     * @param o The object to compare to.
     * @return An integer value representing the comparison of the two objects' heights.
     */
    @Override
    public int compareTo(Object o) {
        Tree other = (Tree) o;
        return Integer.compare(this.height, other.height);
    }

    /**
     * Returns a string representation of the tree.
     * @return A string representation of the tree.
     */
    @Override
    public String toString() {
        return "Tree " +
                "height=" + height +
                ", season=" + season +
                ", leavesColor=" + leavesColor;
    }

    /**
     * Changes the current season of the tree to the next season.
     */
    @Override
    public void changeSeason() {
        season = season.nextSeason();
    }
}
