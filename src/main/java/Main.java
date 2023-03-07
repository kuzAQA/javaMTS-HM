import static ArraysHomework.Employee.employeesOver40age;
import static ArraysHomework.Employee.upSalaryАfter45age;

import ArraysHomework.Employee;

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
        Employee[] arr = {
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
        upSalaryАfter45age(arr);
    }
}
