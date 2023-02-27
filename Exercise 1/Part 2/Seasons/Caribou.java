public class Caribou extends Animal {

    Caribou(int weight, Season season) {
        super(weight, season, Color.BROWN);
        setColor();
    }

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

    @Override
    public void changeSeason() {
        super.changeSeason();
        setColor();
    }

    private void setColor() {
        if (super.getCurrentSeason() == Season.WINTER)
            color = Color.WHITE;
        else
            color = Color.BROWN;
    }
}
