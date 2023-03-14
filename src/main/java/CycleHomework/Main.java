package CycleHomework;

import static CycleHomework.CycleHomework.fullCycle;
import static CycleHomework.CycleHomework.triangleCycle;
import static CycleHomework.CycleHomework.zeroCycle;

public class Main {

    public static void main(String[] args) {
        //Домашняя работа по циклам
        fullCycle(6, 6, "*");
        zeroCycle(6, 6, "*", "0");
        triangleCycle(6, 6, "*", "0");
    }
}
