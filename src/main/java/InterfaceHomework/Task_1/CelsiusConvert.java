package InterfaceHomework.Task_1;

public class CelsiusConvert implements CelsiusConvertTo {

    @Override
    public double celsiusToKelvin(double celsius) {
        double CONST = 274.15;
        return celsius + CONST;
    }

    @Override
    public double celsiusToFahrenheit(double celsius) {
        double COEFFICIENT = 1.8;
        double CONST = 32;
        return (celsius * COEFFICIENT) + CONST;
    }

}
