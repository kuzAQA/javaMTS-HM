import static RegexHomework.RegexTime.regexTime;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.qameta.allure.Story;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@Story("Метод для нахождения времени формата ЧЧ:ММ в строке")
public class RegexTimeTests {

    @DisplayName("Позитивный тест для метода regexTime")
    @Description("Проверка работы regex на формат времени ЧЧ:ММ")
    @ParameterizedTest(name = "Вызов метода regexTime. Позитивный сценарий - (string = {0})")
    @ValueSource(strings = {"00:00",
        "23:59", "1:00", "14:04", "00:10", "22:22",
        "Завтрак в 11:3 0", "06:52 уезжает поезд", "Ровно к 23:02 я тебя жду"})
    public void successRegexTimeTest(String arg) {
        assertTrue(regexTime(arg), String.format("Неверный параметр \"%s\"", arg));
    }

    @DisplayName("Негативный тест для метода regexTime")
    @Description("Проверка работы regex на формат времени ЧЧ:ММ")
    @ParameterizedTest(name = "Вызов метода regexTime. Негативный сценарий (string = {0})")
    @ValueSource(strings = {"33:33", "24:59", "02:03", "90:90", "99:99", "15:22", "02: 99", "9:59",
        "123:139", "Начало ровно в 1411:0", ":30 уезжает поезд", "Ровно к 2302 я тебя жду"})
    public void failureRegexTimeTest(String arg) {
        assertFalse(regexTime(arg), String.format("Неверный параметр \"%s\"", arg));
    }
}
