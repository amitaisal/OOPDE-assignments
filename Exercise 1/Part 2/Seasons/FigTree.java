public class FigTree extends Tree {

    FigTree(int height, Season season) {
        super(height,season,null);
        setColor();
    }

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

    @Override
    public void changeSeason() {
        super.changeSeason();
        setColor();
        changeHeight();
    }

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
