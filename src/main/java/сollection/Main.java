package сollection;

import static сollection.CollectionHomework.addOneMillion;
import static сollection.CollectionHomework.removeDuplicatesFromCollection;
import static сollection.CollectionHomework.selectRandomElements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //Домашнее задание по коллекциям #1
        List<Integer> listInteger = Arrays.asList(1, 2, 1, 3, 8, 8, 4, 6, 0, 2, 7, 9, 0);
        System.out.println("Дубликаты удалены: " + removeDuplicatesFromCollection(listInteger));

        //Домашнее задание по коллекциям #2
        List<Integer> oneMillionArrayList = new ArrayList<>();
        List<Integer> oneMillionLinkedList = new LinkedList<>();

        selectRandomElements(addOneMillion(oneMillionArrayList));
        selectRandomElements(addOneMillion(oneMillionLinkedList));
        /*Вариант с ArrayList выполнен быстрее,
         * потому что LinkedList - это связный список, где элемент имеет
         * ссылку на элемент до себя и после себя, из-за чего операции
         * с доступомм по индексу занимают больше времени*/
    }
}
