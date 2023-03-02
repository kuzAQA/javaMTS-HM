import static CycleHomework.CycleHomework.triangleCycle;

import ExtendsHomework.Task_1.Animal;
import ExtendsHomework.Task_1.Bird;
import ExtendsHomework.Task_1.Cat;
import ExtendsHomework.Task_1.Dog;
import ExtendsHomework.Task_1.Horse;
import ExtendsHomework.Task_2.Human;
import ExtendsHomework.Task_2.Treadmill;
import ExtendsHomework.Task_2.Trial;
import ExtendsHomework.Task_2.Wall;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*        Домашняя работа по циклам
        fullCycle(6,6, "*");
        zeroCycle(6,6, "*", "0");
        triangleCycle(6,6, "*", "0");*/

//        Домашняя работа по наследованию классов #1
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal horse = new Horse();
        Animal bird = new Bird();

        Animal[] animals = {dog, cat, horse, bird};

        for (Animal animal : animals) {
            animal.run(200);
            animal.swim(2);
            animal.jumpingOverObstacles(2);
        }

//        Домашняя работа по наследованию классов #2

    }
}
