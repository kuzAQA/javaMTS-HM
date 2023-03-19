package InterfaceHomework.Task_2;

public class Treadmill implements Obstacle {

    private final double length;

    Treadmill(double length) {
        this.length = length;
    }

    @Override
    public boolean passage(Participants participant) {
        return participant.run(length);
    }
}