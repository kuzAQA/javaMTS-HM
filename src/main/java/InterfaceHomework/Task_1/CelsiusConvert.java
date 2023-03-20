package InterfaceHomework.Task_1;

public class CelsiusConvert implements CelsiusConvertTo {

    @Override
    public double celsiusTo(double celsius, String scale) {
        if (scale.equals("K")) {
            return celsius + 273.15;
        } else if (scale.equals("F")) {
            return celsius * 9 / 5 + 32;
        } else {
            throw new IllegalArgumentException("Невалидный параметр градусов: " + scale);
        }
    }

    @Override
    public double celsiusTo(int celsius, String scale) {
        if (scale.equals("K")) {
            return (double) celsius + 273.15;
        } else if (scale.equals("F")) {
            return (double) celsius * 9 / 5 + 32;
        } else {
            throw new IllegalArgumentException("Невалидный параметр градусов: " + scale);
        }
    }

    @Override
    public long celsiusTo(long celsius, String scale) {
        if (scale.equals("K")) {
            return (long) (celsius + 273.15);
        } else if (scale.equals("F")) {
            return celsius * 9 / 5 + 32;
        } else {
            throw new IllegalArgumentException("Невалидный параметр градусов: " + scale);
        }
    }
}
