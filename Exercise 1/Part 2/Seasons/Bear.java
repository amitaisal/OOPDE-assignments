public class Bear extends Animal {

    Bear(int weight, Season season) {
        super(weight,season,Color.BROWN);
    }

    @Override
    public String toString() {
        String str = "";
        if(getCurrentSeason() == Season.WINTER)
            str += "I am sleeping. ";

        return "Bear. " + str +
                "My weight is: " + weight +
                " and my color is: " + color +  '\n';
    }

    @Override
    public void changeSeason() {
        super.changeSeason();
        if (super.getCurrentSeason() == Season.WINTER) {
            weight = (int)Math.round(weight * 0.8);
        } else if (super.getCurrentSeason() == Season.SPRING) {
            weight = (int)Math.round(weight * 0.75);
        } else if (super.getCurrentSeason() == Season.SUMMER) {
            weight = (int)Math.round(weight + weight/3.);
        } else if (super.getCurrentSeason() == Season.FALL) {
            weight = (int)Math.round(weight * 1.25);
        }
    }
}
