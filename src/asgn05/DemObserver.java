package asgn05;

import java.util.Observable;

import implementedElecStrategies.ElectoralDemMostStrategy;
import implementedElecStrategies.ElectoralHonestStrategy;
import implementedPoptrategies.PopularDemStrategy;

public class DemObserver extends ElectionObserver{
	
	public DemObserver(Observable o) {
		super(o);
		this.setElec(new ElectoralDemMostStrategy());
		this.setPop(new PopularDemStrategy());
		this.observerName="This display favors democrats";
		}
}
