package implementedElecStrategies;

import asgn05.ElectoralCollegeStrategy;
import asgn05.StateVotes;

public class ElectoralDemMostStrategy implements ElectoralCollegeStrategy{

	@Override
	public int getDemResults(StateVotes[] states) {
		int total=0;
		int most=0;
		int mIndex=-1;
		for(int c=0;c<states.length;c++) {
			if(states[c].getElecCount()>most) {
				most=states[c].getElecCount();
				mIndex=c;
			}
		}
		
		for(int c=0;c<states.length;c++) {
			if(c!=mIndex) {
				if(states[c].getdVotes()>states[c].getrVotes()) {
					total=+states[c].getElecCount();
				}
			}
		}
		total+=states[mIndex].getElecCount();
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
