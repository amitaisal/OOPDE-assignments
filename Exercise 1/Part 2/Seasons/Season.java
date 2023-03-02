public enum Season {
    WINTER, SPRING, SUMMER, FALL;

    /**
     * A method that change the season to the next season.
     * @return the next season.
     */
    public Season nextSeason() {
        if (this == WINTER) {
            return SPRING;
        } else if (this == SPRING) {
            return SUMMER;
        } else if (this == SUMMER) {
            return FALL;
        } else if (this == FALL) {
            return WINTER;
        }
        return null;
    }
}
