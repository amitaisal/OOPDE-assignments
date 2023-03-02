public interface Seasonable {
    /**
     * Gets the current season of the object.
     */
    Season getCurrentSeason();
    /**
     * Changes the current season of the object to the next season.
     */
    void changeSeason();
}
