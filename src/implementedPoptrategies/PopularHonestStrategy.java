package implementedPoptrategies;

import asgn05.PopularVoteStrategy;
import asgn05.StateVotes;

public class PopularHonestStrategy implements PopularVoteStrategy{
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
		for(int c =0; c<states.length;c++) {
			total+=states[c].getrVotes();
		}
		return total;
	}
}
