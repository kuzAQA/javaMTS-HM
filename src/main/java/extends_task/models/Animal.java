package extends_task.models;

public class Animal {

    String name = "Животное";
    double maxRun = 1;
    double maxSwim = 1;
    double maxJump = 1;

    public void run(double distance) {
        if (distance > maxRun) {
            System.out.println(name + " не может пробежать такое расстояние.");
        } else {
            System.out.println(name + " пробежала!");
        }
    }

    public void swim(double distance) {
        if (distance > maxSwim) {
            System.out.println(name + " не может проплыть такое расстояние.");
        } else {
            System.out.println(name + " проплыла!");
        }
    }

    public void jumpingOverObstacles(double length) {
        if (length > maxJump) {
            System.out.println(name + " не может прыгнуть на такую высоту");
        } else {
            System.out.println(name + " перепрыгнула!");
        }
    }
}
