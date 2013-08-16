package footballmanager;

import java.util.Observable;

class FootballManagerModel extends Observable {
	private Calendar calendar;
	
	protected FootballManagerModel(FootballManagerView footballManagerView) {
		this.calendar = new Calendar();
		this.addObserver(footballManagerView);
		this.setChanged();
		this.notifyObservers(this.calendar);
	}
	
	protected void newDay() {
		this.calendar.newDay();
		this.setChanged();
		this.notifyObservers(this.calendar);
	}
}
