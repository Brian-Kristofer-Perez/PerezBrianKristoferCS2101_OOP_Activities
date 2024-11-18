enum DanceStyle {
    BALLET,
    HIPHOP,
    JAZZ,
    CONTEMPORARY
}

public class Dancer extends Artist {
    private DanceStyle danceStyle;

    public Dancer(String name, String nationality, int age, String specialty, DanceStyle danceStyle) {
        super(name, nationality, age, specialty);
        this.danceStyle = danceStyle;
    }

    // getters!
    public DanceStyle getDanceStyle() {
        return danceStyle;
    }

    // setters!
    public void setDanceStyle(DanceStyle danceStyle) {
        this.danceStyle = danceStyle;
    }

    @Override
    public void displayInfo() {
        System.out.println("Dancer Info: ");
        super.displayInfo();
        System.out.println("Dance style: " + danceStyle);
    }
}