package asgn05;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Observable;
import java.util.Observer;

public abstract class ElectionObserver implements Observer {
	Observable observable;
	private ElectoralCollegeStrategy elecStrat;
	private PopularVoteStrategy popStrat;
	String observerName;
	private StateVotes[] states;
	
	public ElectionObserver(Observable observable) {
		this.observable=observable;
		observable.addObserver(this);
	}
	
	public void displayFirst() {
		System.out.println(observerName);
		
		//general message
		System.out.print("Election results with");
		
		for(int c=0; c<states.length; c++) {
		System.out.print(", "+states[c].getState());
		}
		
		System.out.println(" currently reporting");
		System.out.println();
		
		//display pop vote
		System.out.println("Popular vote: ");
		System.out.println("             Democratic Vote Count-"+popStrat.getDemResults(states));
		System.out.println("             Republican Vote Count-"+popStrat.getRepubResults(states));
		System.out.println();
	}
	
	public void displaySecond() {
		//display electoral vote
				System.out.println("Electoral College vote: ");
				System.out.println("             Democratic Vote Count-"+elecStrat.getDemResults(states));
				System.out.println("             Republican Vote Count-"+elecStrat.getRepubResults(states));
				System.out.println();
		
	}
	
	public void displayThird() {
		System.out.println("All reports are purely observational and not legally binding in any way ");
		System.out.println(new SimpleDateFormat("hh:mm:ss a").format(new Date()));
		System.out.println();
		System.out.println();
	}

	@Override
	public void update(Observable o, Object states) {
		
		this.states=(StateVotes[]) states;
		
		displayFirst();
		displaySecond();
		displayThird();
		
		
		
	}
	
	public void setElec(ElectoralCollegeStrategy elecStrat) {
		this.elecStrat=elecStrat;
	}
	
	public void setPop(PopularVoteStrategy popStrat) {
		this.popStrat=popStrat;
	}
	
	
	

}
