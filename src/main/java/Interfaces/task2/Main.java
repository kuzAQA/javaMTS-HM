package Interfaces.task2;

import static сollection.CollectionHomework.randomNumber;

import Interfaces.task2.models.Cat;
import Interfaces.task2.models.Human;
import Interfaces.task2.models.Participants;
import Interfaces.task2.models.Robot;
import Interfaces.task2.obstacles.Treadmill;
import Interfaces.task2.obstacles.Wall;
import Interfaces.task2.service.Obstacle;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //Коллекция с участниками
        List<Participants> listParticipants = List.of(
            new Human("Аркадий", 400, 2),
            new Robot("Бендер", 550, 5),
            new Cat("Барсик-мяу", 450, 2)
        );
        //Набор препятствий со случайной генераций значений
        List<Obstacle> listObstacles = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            listObstacles.add(new Wall(randomNumber(1, 5)));
            listObstacles.add(new Treadmill(randomNumber(200, 600)));
        }
        /*
        Прохождения препятствий участниками.
        Если участник не проходи испытание - он выбывает из соревнований
        */
        for (Participants runner : listParticipants) {
            for (Obstacle obstacle : listObstacles) {
                if (!obstacle.passage(runner)) {
                    break;
                }
            }
        }
    }
}