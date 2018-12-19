package asgn05;

import java.util.Observable;

public class ElectionData extends Observable{
	private StateVotes[] states;
	
	public ElectionData(int num ) {
		states=new StateVotes[num];
	}
	
	public void votesChanged() {
		setChanged();
		notifyObservers(states);
	}
	
	public void setVotes(USState state, int rVotes, int dVotes, int elecCount) {
		for(int c=0; c<states.length; c++) {
			if(states[c].getState().equals(state)) {
				states[c].setdVotes(dVotes);
				states[c].setrVotes(rVotes);
				states[c].setElecCount(elecCount);
				votesChanged();
				return;
			}
		}
		
	}
	
	public void setAllStates(StateVotes[] states) {
		this.states=states;
		votesChanged();
	}
	
	
	
}
