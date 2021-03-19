public class AppDemo {

    public static void main(String[] args) {
        Model[] participants = new Model[5];
        participants[0] = new Cat("Барсик", 200, 5);
        participants[1] = new Human("Дмитрий", 500, 20);
        participants[2] = new Robot("54321", 700, 3);
        participants[3] = new Robot("12345", 50, 35);
        participants[4] = new Cat("Мурзик", 300, 7);
        Obstacles[] obstacles = new Obstacles[5];
        obstacles[0] = new Wall(12);
        obstacles[1] = new Wall(6);
        obstacles[2] = new Track(300);
        obstacles[3] = new Wall(10);
        obstacles[4] = new Track(100);
    }

}
