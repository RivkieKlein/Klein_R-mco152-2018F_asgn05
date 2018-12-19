package implementedElecStrategies;

import asgn05.ElectoralCollegeStrategy;
import asgn05.StateVotes;

public class ElectoralRepubTooCloseStrategy implements ElectoralCollegeStrategy {
	

	@Override
	public int getDemResults(StateVotes[] states) {
		int allTotal=0;
		for(int c =0; c<states.length;c++) {
			allTotal+=states[c].getElecCount();
		}
		
		return allTotal-getRepubResults(states);
	}

	@Override
	public int getRepubResults(StateVotes[] states) {
		int total=0;
		int difference=0;
		int difIndex=-1;
		
		for(int c=0;c<states.length;c++) {
			if(states[c].getrVotes()>states[c].getdVotes()) {
				total+=states[c].getElecCount();
			}
			else if(states[c].getdVotes()-states[c].getrVotes()>difference) {
				difference=states[c].getdVotes()-states[c].getrVotes();
				difIndex=c;
			}
		}
		
		if(difIndex>-1) {
			int votes = states[difIndex].getElecCount();
			if(votes%2==1) {
				total+=((votes+1)/2);
			}
			else {
				total+=votes/2;
			}
		}
		
		
		
		return total;
	}
	
	

}
