public class Human implements Player {
    private String name;
    private int canJump;
    private int canRun;

    public Human(String name, int canRun, int canJump){
        this.name = name;
        this.canRun = canRun;
        this.canJump = canJump;
    }

    @Override
    public int getCanJump() {
        return canJump;
    }

    @Override
    public void jump() {
        System.out.println("Human jump");
    }

    @Override
    public int getCanRun() {
        return canRun;
    }

    @Override
    public void run() {
        System.out.println("Human run");
    }

    public String getName() {
        return name;
    }
}
