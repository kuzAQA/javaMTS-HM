package ExtendsHomework.Task_1;

public class Horse extends Animal {
    @Override
    public void run(double distance) {
        if (distance > 1500) {
            System.out.println("Конь не может пробежать такое расстояние");
        } else {
            System.out.println("Конь пробежал!");
        }
    }

    @Override
    public void swim(double distance) {
        if (distance > 100) {
            System.out.println("Конь не может проплыть такое расстояние");
        } else {
            System.out.println("Конь проплыл!");
        }
    }

    @Override
    public void jumpingOverObstacles(double length) {
        if (length > 3) {
            System.out.println("Конь не может это перепрыгнуть");
        } else {
            System.out.println("Конь перепрыгнул!");
        }
    }
}
