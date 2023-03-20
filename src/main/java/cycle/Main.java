package cycle;

import static cycle.CycleHomework.fullCycle;
import static cycle.CycleHomework.triangleCycle;
import static cycle.CycleHomework.zeroCycle;

public class Main {

    public static void main(String[] args) {
        //Домашняя работа по циклам
        fullCycle(6, 6, "*");
        zeroCycle(6, 6, "*", "0");
        triangleCycle(6, 6, "*", "0");
    }
}
