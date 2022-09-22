package ScoreWithEvents;


import java.util.EventObject;

public class ScoreEvent extends EventObject {
     private String someData;
    
    public ScoreEvent(Object o, String str) {
        super(o);
        someData = str;
    }
    
     public String getSomeData() {
        return someData;
    }
    
}
