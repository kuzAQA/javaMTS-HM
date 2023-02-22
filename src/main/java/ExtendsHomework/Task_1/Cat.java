package ExtendsHomework.Task_1;

public class Cat extends Animal {
    @Override
    public void run(double distance) {
        if (distance > 200) {
            System.out.println("Котик не может пробежать такое расстояние");
        } else {
            System.out.println("Котик пробежал!");
        }
    }

    @Override
    public void swim(double distance) {
        if (distance > 0) {
            System.out.println("Котик не умеет плавать");
        }
    }

    @Override
    public void jumpingOverObstacles(double length) {
        if (length > 2) {
            System.out.println("Котик не может это перепрыгнуть");
        } else {
            System.out.println("Котик перепрыгнул!");
        }
    }
}
