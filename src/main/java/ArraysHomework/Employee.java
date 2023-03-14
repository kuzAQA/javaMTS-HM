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
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("%s | %s %s | %s руб. | %s лет", fullName, jobTitle, phone, salary,
            age);
    }

    public static void employeesOver40age(Employee[] arr) {
        for (Employee obj : arr) {
            if (obj.getAge() > 40) {
                //выводил obj.toString, но идея сказала, что это лишнее
                System.out.println(obj);
            }
        }
    }

    public static void upSalaryAfter45age(Employee[] arr) {
        for (Employee obj : arr) {
            if (obj.age > 45) {
                obj.salary = obj.salary + 5000;
                System.out.printf(
                    "Сотруднику %s повышена зарплата на 5000р, т.к его возраст более 45 лет%n",
                    obj.fullName);
            }
        }
    }
}
