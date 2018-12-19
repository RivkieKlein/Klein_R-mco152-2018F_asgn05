package asgn05;

public class StateVotes {
	private USState state;
	private int rVotes;
	private int dVotes;
	private int elecCount;
	
	public StateVotes(USState state, int rVotes, int dVotes, int elecCount){
		this.state=state;
		this.rVotes=rVotes;
		this.dVotes=dVotes;
		this.elecCount=elecCount;
	}

	public USState getState() {
		return state;
	}

	public void setState(USState state) {
		this.state = state;
	}

	public int getrVotes() {
		return rVotes;
	}

	public void setrVotes(int rVotes) {
		this.rVotes = rVotes;
	}

	public int getdVotes() {
		return dVotes;
	}

	public void setdVotes(int dVotes) {
		this.dVotes = dVotes;
	}

	public int getElecCount() {
		return elecCount;
	}

	public void setElecCount(int elecCount) {
		this.elecCount = elecCount;
	}
	
	
}
