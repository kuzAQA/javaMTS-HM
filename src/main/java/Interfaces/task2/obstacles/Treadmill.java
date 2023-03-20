package Interfaces.task2.obstacles;

import Interfaces.task2.models.Participants;
import Interfaces.task2.service.Obstacle;

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