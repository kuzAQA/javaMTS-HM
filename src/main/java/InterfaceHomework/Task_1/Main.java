package InterfaceHomework.Task_1;

public class Main {

    public static void main(String[] args) {
        CelsiusConvertTo convert = new CelsiusConvert();
        System.out.println(convert.celsiusTo(12, "K"));
        System.out.println(convert.celsiusTo(12, "F"));
    }
}
