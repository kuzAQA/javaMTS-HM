package InterfaceHomework.Task_2.obstacles;

import InterfaceHomework.Task_2.models.Participants;
import InterfaceHomework.Task_2.service.Obstacle;

public class Treadmill implements Obstacle {

    private final double length;

    public Treadmill(double length) {
        this.length = length;
    }

    @Override
    public boolean passage(Participants participant) {
        return participant.run(length);
    }
}