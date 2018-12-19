package asgn05;

public class FlipFlopObserver extends ElectionObserver{
	
	public FlipFlopObserver() {
		this.setElec(new ElectoralRepubSetStateStrategy);
		this.setPop(new PopularDemStrategy);
		}
}
