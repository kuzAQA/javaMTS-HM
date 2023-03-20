package InterfaceHomework.Task_2.models;

public abstract class Participants {

    private final String name;
    private final double maxRunDistance;
    private final double maxJumpHeight;

    public Participants(String name, double maxRunDistance, double maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    public boolean run(double length) {
        if (length <= maxRunDistance) {
            System.out.printf("%s успешно пробежал %s метров! :)\n", name, length);
            return true;
        } else {
            System.out.printf("- %s не смог пробежать %s метров. "
                + "Он выбывает из соревнований :(\n", name, length);
            return false;
        }
    }

    public boolean jump(double height) {
        if (height <= maxJumpHeight) {
            System.out.printf("%s успешно перепрыгнул %s метра! :)\n", name, height);
            return true;
        } else {
            System.out.printf("- %s не смог перепрыгнуть %s метра. "
                + "Он выбывает из соревнований :(\n", name, height);
            return false;
        }
    }
}
