package Interfaces.task1;

public class Main {

    public static void main(String[] args) {
        CelsiusConvertTo convert = new CelsiusConvert();
        System.out.println(convert.celsiusTo(123, "K"));
        System.out.println(convert.celsiusTo(12.2, "K"));
        System.out.println(convert.celsiusTo(11232.2, "K"));
    }
}
