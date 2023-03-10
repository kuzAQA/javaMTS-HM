import static CollectionHomework.CollectionHomework.addOneMillion;
import static CollectionHomework.CollectionHomework.removeDuplicatesFromCollection;
import static CollectionHomework.CollectionHomework.selectRandomElements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        Домашняя работа по циклам
/*        fullCycle(6,6, "*");
        zeroCycle(6,6, "*", "0");
        triangleCycle(6,6, "*", "0");*/

//        Домашняя работа по наследованию классов #1
/*      Animal dog = new Dog();
        Animal cat = new Cat();
        Animal horse = new Horse();
        Animal bird = new Bird();

        Animal[] animals = {dog, cat, horse, bird};

        for (Animal animal : animals) {
            animal.run(200);
            animal.swim(2);
            animal.jumpingOverObstacles(2);*/

//        Домашняя работа по наследованию классов #2

//        Домашняя работа по массивам #1
//        multiByTwo();

//        Домашняя работа по массивам #2
//        createArrDiagonal();

//        Домашняя работа по массивам #3
//        minMaxElement();

        //Итоговая работа по массивам
/*        Employee[] arr = {
            new Employee("Игорь", "Инженер по тестированию",
                "+79999999999", 40000, 25),
            new Employee("Игорь", "Инженер по тестированию",
                "+79999999999", 40000, 46),
            new Employee("Андрей", "Разработчик",
                "+79999999999", 250000, 42),
            new Employee("Евгений", "Бизнес-Аналитик",
                "+79999999999", 124000, 55)};

        //вывод инфо о сотрудниках старше 40 лет
        employeesOver40age(arr);
        //метод для повышения зарплаты сотрудникас старше 45 лет, вариант 1.
        upSalaryАfter45age(arr);*/

        //Домашнее задание по коллекциям #1
        List<Integer> listInteger = Arrays.asList(1, 2, 1, 3, 8, 8, 4, 6, 0, 2, 7, 9, 0);
        System.out.println("Дубликаты удалены: " + removeDuplicatesFromCollection(listInteger));

        //Домашнее задание по коллекциям #2
        List<Integer> oneMillionArrayList = new ArrayList<>();
        List<Integer> oneMillionLinkedList = new LinkedList<>();

        selectRandomElements(addOneMillion(oneMillionArrayList));
        selectRandomElements(addOneMillion(oneMillionLinkedList));
        /*Вариант с ArrayList выполнен быстрее,
         * потому что LinkedList - это связный список, где элемент имеет
         * ссылку на элемент до себя и после себя, из-за чего операции
         * с доступомм по индексу занимают больше времени*/
    }
}
