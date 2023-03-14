package CollectionHomework;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class CollectionHomework {

    public static List<Integer> removeDuplicatesFromCollection(List<Integer> list) {
        //Вариант 1
        return list.stream().distinct().collect(Collectors.toList());

        //Вариант 2
//        return new HashSet<>(list);
    }

    public static List<Integer> addOneMillion(List<Integer> million) {
        for (int i = 0; i < 10000000; i++) {
            million.add(i);
        }
        return million;
    }

    public static int randomNumber(int min, int max) {
        return new Random().nextInt(max - min) + min;
    }

    public static String selectRandomElements(List<Integer> list) {
        List<Integer> resultList = new ArrayList<>();
        Date startDate = new Date();

        for (int i = 0; i < 100000; i++) {
            resultList.add(list.get(randomNumber(0, 100000)));
        }
        Date endDate = new Date();
        long duration = endDate.getTime() - startDate.getTime();
        double diffInMilliSeconds = (double) TimeUnit.MILLISECONDS.toMillis(duration) / 1000;

        System.out.println(diffInMilliSeconds + " секунд заняло выполнение цикла");

        return resultList.toString();
    }
}
