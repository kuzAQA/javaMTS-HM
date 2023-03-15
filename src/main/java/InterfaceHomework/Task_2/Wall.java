package InterfaceHomework.Task_2;

public class Wall {

    private final double length;
    private final Skills[] participants;

    public Wall(double length, Skills[] participants) {
        this.length = length;
        this.participants = participants;
    }

    public void jumping() {
        for (int i = 0; i < participants.length; i++) {
            participants[i].jump(length);
        }
    }
}
