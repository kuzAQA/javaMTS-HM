package ExtendsHomework.Task_1;

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
