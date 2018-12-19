package implementedElecStrategies;

import asgn05.ElectoralCollegeStrategy;
import asgn05.StateVotes;

public class ElectoralDem2OffStrategy implements ElectoralCollegeStrategy{

	

	@Override
	public int getDemResults(StateVotes[] states) {
		int total=0;
		for(int c =0; c<states.length;c++) {
			if(states[c].getdVotes()>states[c].getrVotes()) {
				total+=states[c].getElecCount();
			}
			
			else {
				int change=(int) (states[c].getrVotes()*.02);
				if(states[c].getdVotes()+change>states[c].getrVotes()-change) {
					total+=states[c].getElecCount();
				}
			}
		}
		
		return total;
	}

	@Override
	public int getRepubResults(StateVotes[] states) {
		int allTotal=0;
		for(int c =0; c<states.length;c++) {
			allTotal+=states[c].getElecCount();
		}
		
		return allTotal-getDemResults(states);
	}

}
