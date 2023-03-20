package extends_task;

import extends_task.models.Animal;
import extends_task.models.Bird;
import extends_task.models.Cat;
import extends_task.models.Dog;
import extends_task.models.Horse;

public class Main {

    public static void main(String[] args) {
        //Домашняя работа по наследованию классов #1
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
    }
}
