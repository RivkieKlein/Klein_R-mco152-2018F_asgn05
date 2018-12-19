package implementedElecStrategies;

import asgn05.ElectoralCollegeStrategy;
import asgn05.StateVotes;

public class ElectoralHonestStrategy implements ElectoralCollegeStrategy{

	@Override
	public int getDemResults(StateVotes[] states) {
		int total=0;
		
		for(int c=0; c<states.length;c++) {
			if(states[c].getdVotes()>states[c].getrVotes()) {
				total+=states[c].getElecCount();
			}
		}
		
		return total;
		
	}

	@Override
	public int getRepubResults(StateVotes[] states) {
		int total=0;
		
		for(int c=0; c<states.length;c++) {
			if(states[c].getrVotes()>states[c].getdVotes()) {
				total+=states[c].getElecCount();
			}
		}
		
		return total;
	}

}
