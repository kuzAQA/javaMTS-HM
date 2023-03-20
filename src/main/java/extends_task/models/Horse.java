package extends_task.models;

public class Horse extends Animal {

    String name = "Лошадь";
    double maxRun = 1500;
    double maxSwim = 100;
    double maxJump = 3;

    public Horse() {
        super.name = this.name;
        super.maxRun = this.maxRun;
        super.maxSwim = this.maxSwim;
        super.maxJump = this.maxJump;
    }
}
