package ArraysHomework;

public class Employee {

    String fullName;
    String jobTitle;
    String phone;
    double salary;
    int age;

    public Employee(String fullName, String jobTitle, String phone, double salary, int age) {
        this.fullName = fullName;
        this.jobTitle = jobTitle;
        this.phone = phone;
        this.salary = salary;
        this.age = age;

/*      Установка зарплаты сразу всем сотрудникам, у которых возраст более 45 лет.
        Не уверен, насколько правильно подобные вещи делать сразу в конструкторе.*/
        /*if (age > 45) {
            this.salary = salary + 5000;
        }*/
    }

    public String getFullName() {
        return fullName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getPhone() {
        return phone;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public String getInfoEmployee() {
        return fullName + " | " + jobTitle + " | " + phone + " | " + salary + "руб." + " | " + age
            + " лет";
    }

    public static void employeesOver40age(Employee[] arr) {
        for (Employee obj : arr) {
            if (obj.getAge() > 40) {
                System.out.println(obj.getInfoEmployee());
            }
        }
    }

    public static void upSalaryАfter45age(Employee[] arr) {
        for (Employee obj : arr) {
            if (obj.age > 45) {
                obj.salary = obj.salary + 5000;
                System.out.println("Сотруднику " + obj.fullName
                    + " повышена зарплата на 5000р, т.к его возраст более 45 лет");
            }
        }
    }
}
