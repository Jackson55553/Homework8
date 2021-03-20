public class Wall implements Obstacles{
    private int height;
    private final String Name = "Стена";

    public Wall(int height){
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public boolean toRun(int canRun) {
        return false;
    }

    @Override
    public boolean toJump(int canJump) {
        return (canJump >= height);
    }

    @Override
    public String getName() {
        return Name;
    }
}
