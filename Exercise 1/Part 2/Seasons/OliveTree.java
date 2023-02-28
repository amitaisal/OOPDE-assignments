public class OliveTree extends Tree {

    OliveTree(int height, Season season) {
        super(height,season,Color.GREEN);
    }

    @Override
    public String toString() {
        String str = "";
        if (getCurrentSeason() == Season.FALL)
            str += "I give fruit. ";

        return "Olive tree. " + str +
                "My height is: " + height +
                " and my color is: " + leavesColor + '\n';
    }

    @Override
    public void changeSeason() {
        super.changeSeason();
        changeHeight();

    }

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
