package ScoreWithEvents;

import java.util.ArrayList;

public class ScoreSource {
    
	private ArrayList<ScoreListener> listeners;
	public ScoreSource() {
		listeners = new ArrayList<>();
	}
	public void setScoreLine(String str) {
            fireScoreEvent(new ScoreEvent(this, str));
	}
        
	public void addScoreListener(ScoreListener l) {
            listeners.add(l);
	}
	public void removeScoreListener(ScoreListener l) {
            listeners.remove(l);
	}
	public void fireScoreEvent(ScoreEvent e) {
            for(int i = 0; i < listeners.size(); i++) {
                ScoreListener l = listeners.get(i);
                l.scoreChange(e);
            }
	}
}
