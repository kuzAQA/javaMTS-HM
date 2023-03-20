package extends_task.models;

public class Bird extends Animal {

    String name = "Птичка";
    double maxRun = 5.0;
    double maxSwim = 0;
    double maxJump = 0.2;

    public Bird() {
        super.name = this.name;
        super.maxRun = this.maxRun;
        super.maxSwim = this.maxSwim;
        super.maxJump = this.maxJump;
    }

    @Override
    public void jumpingOverObstacles(double distance) {
        System.out.println(name + " не умеет плавать");
    }
}
