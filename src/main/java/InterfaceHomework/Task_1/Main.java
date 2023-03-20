package InterfaceHomework.Task_1;

public class Main {

    public static void main(String[] args) {
        CelsiusConvertTo convert = new CelsiusConvert();
        System.out.println(convert.celsiusTo(12312, "K"));
        System.out.println(convert.celsiusTo(12.2, "K"));
        System.out.println(convert.celsiusTo(422213125, "F"));
    }
}
