package RegexHomework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTime {

    private static final String TIME_24 = "\\b([01]\\d|2[0-3]):([0-5]\\d)\\b";

    private static final Pattern patternTime24 = Pattern.compile(TIME_24);

    public static boolean regexTime(String time) {
        Matcher matcher = patternTime24.matcher(time);
        return matcher.find();
    }
}
