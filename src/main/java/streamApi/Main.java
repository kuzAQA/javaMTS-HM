package streamApi;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
import streamApi.models.Human;
import streamApi.models.Man;
import streamApi.models.Woman;

public class Main {

    public static void main(String[] args) {

        Collection<Human> marathonList = Arrays.asList(
            new Man("Аркадий", 24),
            new Man("Евгений", 32),
            new Man("Артем", 18),
            new Man("Артем", 21),
            new Woman("Анастасия", 26),
            new Woman("Мария", 24),
            new Woman("София", 44),
            new Woman("Виктория", 31)
        );

        marathonList.stream()
            .filter((e) -> e.getAge() >= 20 && e.getClass().getSimpleName().equals("Man")
                || e.getAge() >= 25 && e.getClass().getSimpleName().equals("Woman"))
            .map((e) -> e.getName().toUpperCase())
            .sorted()
            .collect(Collectors.toList())
            .forEach(System.out::println);
    }
}
