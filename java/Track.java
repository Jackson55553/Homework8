public class Track implements Obstacles {
    private int distance;
    private final String Name = "Трэк";

    public Track(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }


    @Override
    public boolean toRun(int canRun) {
        return (canRun >= distance);
    }

    @Override
    public boolean toJump(int canJump) {
        return false;
    }

    @Override
    public String getName() {
        return Name;
    }
}
