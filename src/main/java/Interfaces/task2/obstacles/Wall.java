package Interfaces.task2.obstacles;

import Interfaces.task2.models.Participants;
import Interfaces.task2.service.Obstacle;

public class Wall implements Obstacle {

    private final double height;

    public Wall(double height) {
        this.height = height;
    }

    @Override
    public boolean passage(Participants participant) {
        return participant.jump(height);
    }
}