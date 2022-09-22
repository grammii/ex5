package ScoreWithEvents;

import java.util.Scanner;

public class ScoreWithEvent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ScoreSource source = new ScoreSource();
        Subscriber1 sub1 = new Subscriber1();
        Subscriber2 sub2 = new Subscriber2();
        
        source.addScoreListener(sub1);
        source.addScoreListener(sub2);
        
        boolean b = true;
        while(b) {
            System.out.print("Enter Score " );
            String str = sc.nextLine();
            if(str.equals("")) {
                break;
            }
            source.setScoreLine(str);
        }
   }  
}
