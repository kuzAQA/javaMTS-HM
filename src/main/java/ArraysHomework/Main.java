package ArraysHomework;

import static ArraysHomework.ArraysHomework.createArrDiagonal;
import static ArraysHomework.ArraysHomework.minMaxElement;
import static ArraysHomework.ArraysHomework.multiByTwo;
import static ArraysHomework.Employee.employeesOver40age;
import static ArraysHomework.Employee.upSalaryAfter45age;

public class Main {

    public static void main(String[] args) {
        //Домашняя работа по массивам #1
        multiByTwo();

        //Домашняя работа по массивам #2
        createArrDiagonal();

        //Домашняя работа по массивам #3
        minMaxElement();

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
        upSalaryAfter45age(arr);
    }

}
