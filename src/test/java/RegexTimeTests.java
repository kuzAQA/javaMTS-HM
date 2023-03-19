import static RegexHomework.RegexTime.regexTime;
import static org.assertj.core.api.Assertions.assertThat;

import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@Story("Метод для нахождения времени формата ЧЧ:ММ в строке")
public class RegexTimeTests {

    @DisplayName("Позитивный тест для методу regexTime")
    @Description("Проверка работы regex на формат времени ЧЧ:ММ")
    @ParameterizedTest
    @ValueSource(strings = {"00:00",
        "23:59", "01:00", "14:04", "00:10", "22:22",
        "Завтрак в 11:30", "06:52 уезжает поезд", "Ровно к 23:02 я тебя жду"})
    public void successRegexTimeTest(String arg) {
        assertThat(regexTime(arg)).isEqualTo(true);
    }

    @DisplayName("Негативный тест для методу regexTime")
    @Description("Проверка работы regex на формат времени ЧЧ:ММ")
    @ParameterizedTest
    @ValueSource(strings = {"33:33", "24:59", "90:90", "99:99", "02: 99", "9:59", "123:139",
        "Начало ровно в 1411:0", ":30 уезжает поезд", "Ровно к 2302 я тебя жду"})
    public void failureRegexTimeTest(String arg) {
        assertThat(regexTime(arg)).isEqualTo(false);
    }
}
