package School;


enum Level {
    LOW, MEDIUM, HIGH;
}

public enum Subjects {
    MATHEMATICS(Level.LOW, "MAT"),
    POLISH(Level.MEDIUM, "POL"),
    GEOGRAPHY(Level.HIGH, "GEO"),
    ETHIC(Level.MEDIUM, "ETH"),
    WF(Level.HIGH, "WF");

    private final String description;
    private final Level level;

    Subjects(Level level, String description) {
        this.level = level;
        this.description = description;
    }

    public Level getLevel() {
        return level;
    }

    public String getDescription() {
        return description;
    }
}
