public abstract class Animal implements Seasonable, Comparable {

    // The weight of the animal.
    protected int weight;

    // The season the animal is currently in.
    private Season season;

    // The color of the animal.
    protected Color color;

    /**
     * A constructor for the Animal class.
     * @param weight The weight of the animal.
     * @param season The season the animal is in.
     * @param color The color of the animal.
     */
    Animal(int weight, Season season, Color color){
        this.weight = weight;
        this.season = season;
        this.color = color;
    }

    /**
     * Gets the current season of the animal.
     * @return The current season of the animal.
     */
    @Override
    public Season getCurrentSeason() {
        return season;
    }

    /**
     * Compares the weight of the animal to another object.
     * @param o The object to compare to.
     * @return An integer value representing the comparison of the two objects' weights.
     */
    @Override
    public int compareTo(Object o) {
        Animal other = (Animal) o;
        return Integer.compare(this.weight, other.weight);
    }

    /**
     * Returns a string representation of the animal.
     * @return A string representation of the animal.
     */
    @Override
    public String toString() {
        return "Animal " +
                "weight=" + weight +
                ", season=" + season +
                ", color=" + color;
    }

    /**
     * Changes the current season of the animal to the next season.
     */
    @Override
    public void changeSeason() {
        season = season.nextSeason();
    }
}
