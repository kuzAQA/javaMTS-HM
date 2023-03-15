package InterfaceHomework.Task_2;

public class Treadmill {

    private final double distance;
    private final Skills[] participants;

    public Treadmill(double distance, Skills[] participants) {
        this.distance = distance;
        this.participants = participants;
    }

    public void running() {
        for (int i = 0; i < participants.length; i++) {
            participants[i].run(distance);
        }
    }
}
