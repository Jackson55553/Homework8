public class Human implements Action {
    private String name;
    private int canJump;
    private int canRun;

    public Human(String name, int canRun, int canJump){
        this.name = name;
        this.canRun = canRun;
        this.canJump = canJump;
    }


    @Override
    public void jump(Wall wall) {
        if (wall.getHeight() < canJump) {
            System.out.printf("%s пробежал", name);
        } else {
            System.out.printf("%s не пробежал", name);
        }
        }

    @Override
    public void run(Track track) {
        if (track.getDistance() < canRun) {
            System.out.printf("%s пробежал", name);
        } else {
            System.out.printf("%s не пробежал", name);
        }
    }
}
