package ExtendsHomework.Task_1;

public class Cat extends Animal {

    String name = "Кошка";
    double maxRun = 200;
    double maxSwim = 0;
    double maxJump = 2;

    public Cat() {
        super.name = this.name;
        super.maxRun = this.maxRun;
        super.maxSwim = this.maxSwim;
        super.maxJump = this.maxJump;
    }

    @Override
    public void swim(double distance) {
        System.out.println(name + " не умеет плавать");
    }
}
