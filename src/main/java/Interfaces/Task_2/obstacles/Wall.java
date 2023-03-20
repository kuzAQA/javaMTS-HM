package Interfaces.Task_2.obstacles;

import Interfaces.Task_2.models.Participants;
import Interfaces.Task_2.service.Obstacle;

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