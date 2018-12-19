package asgn05;

import java.util.Observable;
import java.util.Observer;

import implementedElecStrategies.ElectoralRepubSetStateStrategy;
import implementedPoptrategies.PopularDemStrategy;

public class FlipFlopObserver extends ElectionObserver implements Observer{
	
	public FlipFlopObserver(Observable o) {
		super(o);
		this.setElec(new ElectoralRepubSetStateStrategy());
		this.setPop(new PopularDemStrategy());
		this.observerName="This display has loyalty issues";
		}
}
