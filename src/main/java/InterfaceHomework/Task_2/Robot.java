package InterfaceHomework.Task_2;

public class Robot implements Skills {

    private final String name;
    private final double limitRun;
    private final double limitJump;

    public Robot(String name, double limitRun, double limitJump) {
        this.name = name;
        this.limitRun = limitRun;
        this.limitJump = limitJump;
    }

    @Override
    public void run(double distance) {
        if (distance > limitRun) {
            System.out.println(name + " не пробежал");
        } else {
            System.out.println(name + " пробежал!");
        }
    }

    @Override
    public void jump(double length) {
        if (length > limitJump) {
            System.out.println(name + " не перепрыгнул");
        } else {
            System.out.println(name + " перепрыгнул!");
        }
    }
}
