public class AppDemo{

    public static void main(String[] args) {
       Player[] players = {
               new Cat("Барсик", 200, 20),
               new Human("Дмитрий", 500, 25),
               new Robot("1212", 50, 70)};
       Obstacles[] obstacles = {
               new Wall(5),
               new Track(200),
               new Wall(15)};
       for (Player player : players){
           System.out.println(player.getName() + " Пробует пройти трассу");
           boolean winner = true;
           for (Obstacles obstacle : obstacles){
               System.out.println(player.getName() + " Пробует пройти " + obstacle.getName());
               if (obstacle.toJump(player.getCanJump()) || obstacle.toRun(player.getCanRun())){
                   System.out.println(" он смог");
               }else{
                   winner =false;
                   System.out.println(" не вышло");
                   break;
               }
            }
           if (winner){
               System.out.println(player.getName() + " Прошёл все");
           }else {
               System.out.println(player.getName() + " Не прошел");
           }
           System.out.println();
        }
    }


}
