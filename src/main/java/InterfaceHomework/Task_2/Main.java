package InterfaceHomework.Task_2;

public class Main {

    public static void main(String[] args) {
        Skills[] arrayParticipants = {
            new Cat("Барсик", 200, 3),
            new Human("Аркадий", 350, 2),
            new Robot("Бендер", 1000, 5)
        };
        Wall wall = new Wall(4, arrayParticipants);
        Treadmill treadmill = new Treadmill(400, arrayParticipants);

        wall.jumping();
        treadmill.running();
    }
}
