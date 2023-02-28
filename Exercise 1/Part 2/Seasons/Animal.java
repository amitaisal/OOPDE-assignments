public abstract class Animal implements Seasonable,Comparable{
    protected int weight;
    private Season season;
    protected Color color;
    Animal(int weight, Season season, Color color){
        this.weight =weight;
        this.season =season;
        this.color =color;
    }

    @Override
    public Season getCurrentSeason() {
        return season;
    }

    @Override
    public int compareTo(Object o) {
        Animal other = (Animal) o;
        return Integer.compare(this.weight, other.weight);
    }

    @Override
    public String toString() {
        return "Animal " +
                "weight=" + weight +
                ", season=" + season +
                ", color=" + color;
    }

    @Override
    public void changeSeason() {
        season = season.nextSeason();
    }
}
