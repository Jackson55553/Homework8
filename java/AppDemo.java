public class AppDemo{

    public static void main(String[] args) {
    Cat cat = new Cat("Барсик", 100, 10);
    Human human = new Human("Дмитрий", 500, 20);
    Robot robot = new Robot("1212", 50, 15);
    Wall wall = new Wall(6);
    Track track = new Track(70);
    cat.run(track);
        System.out.println();
    cat.jump(wall);
        System.out.println();
    human.run(track);
        System.out.println();
    human.jump(wall);
        System.out.println();
    robot.run(track);
        System.out.println();
    robot.jump(wall);
    }

}
