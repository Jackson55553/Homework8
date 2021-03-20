public class Robot implements Player {
    private String id;
    private int canJump;
    private int canRun;

    public Robot(String id, int canRun, int canJump){
        this.id = id;
        this.canRun = canRun;
        this.canJump = canJump;
    }


    @Override
    public int getCanJump() {
        return canJump;
    }

    @Override
    public void jump() {
        System.out.println("robot jump");
    }

    @Override
    public int getCanRun() {
        return canRun;
    }

    @Override
    public void run() {
        System.out.println("robot run");
    }

    @Override
    public String getName() {
        return id;
    }

}
