package InterfaceHomework.Task_1;

public class Main {

    public static void main(String[] args) {
        CelsiusConvertTo convert = new CelsiusConvert();
        System.out.println(convert.celsiusToFahrenheit(12));
        System.out.println(convert.celsiusToKelvin(12));
    }
}
