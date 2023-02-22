package ExtendsHomework.Task_1;

public class Dog extends Animal {
    @Override
    public void run(double distance) {
        if (distance > 500) {
            System.out.println("Собака не может пробежать такое расстояние");
        } else {
            System.out.println("Пёсик пробежал!");
        }
    }

    @Override
    public void swim(double distance) {
        if (distance > 10) {
            System.out.println("Собака не может проплыть такое расстояние");
        } else {
            System.out.println("Пёсик проплыл!");
        }
    }

    @Override
    public void jumpingOverObstacles(double length) {
        if (length > 0.5) {
            System.out.println("Собака не может это перепрыгнуть");
        } else {
            System.out.println("Пёсик перепрыгнул!");
        }
    }
}
