package implementedElecStrategies;

import asgn05.ElectoralCollegeStrategy;
import asgn05.StateVotes;

public class ElectoralRepubSetStateStrategy implements ElectoralCollegeStrategy{
	
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
		int total=states[0].getElecCount();
		for(int c=1;c<states.length;c++) {
			if(states[c].getdVotes()<states[c].getrVotes()) {
				total+=states[c].getElecCount();
			}
		}
		
		return total;
	}

}
