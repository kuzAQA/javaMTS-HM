package ExtendsHomework.Task_1;

public class Bird extends Animal {
    @Override
    public void run(double distance) {
        if (distance > 5) {
            System.out.println("Птичка не может пробежать такое расстояние");
        } else {
            System.out.println("Птичка пробежала!");
        }
    }

    @Override
    public void swim(double distance) {
        if (distance > 0) {
            System.out.println("Птичка не умеет плавать");
        }
    }

    @Override
    public void jumpingOverObstacles(double length) {
        if (length > 0.2) {
            System.out.println("Птичка не может это перепрыгнуть");
        } else {
            System.out.println("Птичка перепрыгнула!");
        }
    }
}
