package asgn05;

public class ElectionDriver {
	public static void main(String []args) {
		ElectionData oElections = new ElectionData();
		
		oElections.addObserver(new DemObserver());
		oElections.addObserver(new FlipFlopObserver());
		oElections.addObserver(new RepubObserver());
		oElections.addObserver(new FavorDemObserver());
		oElections.addObserver(new HonestObserver());
		
		se
	}

}
