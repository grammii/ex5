package ScoreWithEvents;

public class Subscriber1 implements ScoreListener {
    public void scoreChange(ScoreEvent e) {
        System.out.println("Live Result : " + e.getSomeData());
   }
}
