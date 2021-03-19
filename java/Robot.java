public class Robot implements Action {
    private String id;
    private int canJump;
    private int canRun;

    public Robot(String id, int canRun, int canJump){
        this.id = id;
        this.canRun = canRun;
        this.canJump = canJump;
    }

    @Override
    public void jump(Wall wall) {
        if (wall.getHeight() < canJump) {
            System.out.printf("%s пробежал", id);
        } else {
            System.out.printf("%s не пробежал", id);
        }
    }

    @Override
    public void run(Track track) {
        if (track.getDistance() < canRun) {
            System.out.printf("%s пробежал", id);
        } else {
            System.out.printf("%s не пробежал", id);
        }
    }
}
