public abstract class Tree implements Comparable, Seasonable {
    protected int height;
    protected Season season;
    protected Color leavesColor;
    // TODO: Add auxiliary fields and functions.

    Tree(int height, Season season, Color leavesColor){
        this.height = height;
        this.season = season;
        this.leavesColor = leavesColor;
    }

    @Override
    public Season getCurrentSeason() {
        return season;
    }

    @Override
    public int compareTo(Object o) {
        Tree other = (Tree) o;
        return Integer.compare(this.height, other.height);
    }

    @Override
    public String toString() {
        return "Tree " +
                "height=" + height +
                ", season=" + season +
                ", leavesColor=" + leavesColor;
    }

    //create a function that change the season of the tree to the next season
    @Override
    public void changeSeason() {
        if (season == Season.WINTER) {
            season = Season.SPRING;
        } else if (season == Season.SPRING) {
            season = Season.SUMMER;
        } else if (season == Season.SUMMER) {
            season = Season.FALL;
        } else if (season == Season.FALL) {
            season = Season.WINTER;
        }
    }
}
