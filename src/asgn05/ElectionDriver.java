package asgn05;

public class ElectionDriver {
	public static void main(String []args) {
		ElectionData oElections = new ElectionData(5);
		
		new RepubObserver(oElections);
		new DemObserver(oElections);
		new FlipFlopObserver(oElections);
		new FavorDemObserver(oElections);
		new HonestObserver(oElections);
		
		StateVotes[] states = new StateVotes[5];
		states[0]= new StateVotes(USState.TEXAS, 4500000, 3800000, 38);
		states[1]= new StateVotes(USState.SOUTHDAKOTA, 227000, 117000, 3);
		states[2]= new StateVotes(USState.FLORIDA, 4600000, 4480000, 29);
		states[3]= new StateVotes(USState.COLORADO, 1130000, 1200000, 9);
		states[4]= new StateVotes(USState.CONNECTICUT, 668000, 884000, 7);
		oElections.setAllStates(states);
		
		//change one state and everything changes automatically because using push
		
		oElections.setVotes(USState.FLORIDA, 4600000, 4620000, 29);
		
	}

}
