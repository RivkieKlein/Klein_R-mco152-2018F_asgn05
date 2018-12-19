package asgn05;

import java.util.Observable;
import java.util.Observer;

public class ElectionObserver implements Observer {
	Observable observable;
	private ElectoralCollegeStrategy elecStrat;
	private PopularVoteStrategy popStrat;
	private StateVotes[] states;
	
	public ElectionObserver(int num) {
		states=new StateVotes[num];
	}
	
	public void displayFirst() {
		
		//general message
		System.out.println("Election results with");
		
		for(int c=0; c<states.length; c++) {
		System.out.print(", "+states[c].getState());
		}
		
		System.out.println(" currently reporting");
		System.out.println();
		
		//display pop vote
		System.out.println("Popular vote: ");
		System.out.println("             Democratic Vote Count-"+popStrat.getDemResults(states));
		System.out.println("             Republican Vote Count-"+popStrat.getRepubResults(states));
	}
	
	public void displaySecond() {
		//display electoral vote
				System.out.println("Electoral College vote: ");
				System.out.println("             Democratic Vote Count-"+elecStrat.getDemResults(states));
				System.out.println("             Republican Vote Count-"+elecStrat.getRepubResults(states));
		
	}
	
	public void displayThird() {
		System.out.println("All reports are purely observational and not legally binding in any way ");
		System.out.println(System.currentTimeMillis());
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
