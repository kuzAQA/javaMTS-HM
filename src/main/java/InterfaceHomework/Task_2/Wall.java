package InterfaceHomework.Task_2;

public class Wall implements Obstacle {

    private final double height;

    Wall(double height) {
        this.height = height;
    }

    @Override
    public boolean passage(Participants participant) {
        return participant.jump(height);
    }
}