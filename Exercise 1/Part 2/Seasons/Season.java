public enum Season {
    WINTER, SPRING, SUMMER, FALL;

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
