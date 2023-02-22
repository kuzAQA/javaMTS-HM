import ExtendsHomework.Task_1.Animal;
import ExtendsHomework.Task_1.Bird;
import ExtendsHomework.Task_1.Cat;
import ExtendsHomework.Task_1.Dog;
import ExtendsHomework.Task_1.Horse;

public class Main {
    public static void main(String[] args) {
//        Домашняя работа по циклам
//        fullCycle(6,6, "*");
//        zeroCycle(6,6, "*", "0");
//        triangleCycle(6,6, "*", "0");

//        Домашняя работа по наследованию классов
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal horse = new Horse();
        Animal bird = new Bird();

        dog.run(500);
        dog.swim(10);
        dog.jumpingOverObstacles(0.2);

        cat.run(200);
        cat.swim(10);
        cat.jumpingOverObstacles(2);

        horse.run(1501);
        horse.swim(50);
        horse.jumpingOverObstacles(4);

        bird.run(2);
        bird.swim(10);
        bird.jumpingOverObstacles(0.2);
    }
}
