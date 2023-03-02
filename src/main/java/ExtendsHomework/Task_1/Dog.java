package ExtendsHomework.Task_1;

public class Dog extends Animal {

    String name = "Собака";
    double maxRun = 500;
    double maxSwim = 10;
    double maxJump = 0.5;

    public Dog() {
        super.name = this.name;
        super.maxRun = this.maxRun;
        super.maxSwim = this.maxSwim;
        super.maxJump = this.maxJump;
    }
}
