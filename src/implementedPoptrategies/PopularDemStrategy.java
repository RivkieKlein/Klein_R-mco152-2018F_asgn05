package implementedPoptrategies;

import asgn05.PopularVoteStrategy;
import asgn05.StateVotes;

public class PopularDemStrategy implements PopularVoteStrategy{
	
	@Override
	public int getDemResults(StateVotes[] states) {
		int total=0;
		for(int c =0; c<states.length;c++) {
			total+=states[c].getdVotes();
		}
		return total;
	}

	@Override
	public int getRepubResults(StateVotes[] states) {
		int total=0;
		int most=states[0].getrVotes();
		for(int c =1;c<states.length; c++) {
			if(states[c].getrVotes()>most) {
				total+=most;
				most=states[c].getrVotes();
			}
			else {
				total+=states[c].getrVotes();
			}
		}
		return total;
	}
}
