package asgn05;

import java.util.Observable;
import java.util.Observer;

import implementedElecStrategies.ElectoralHonestStrategy;
import implementedPoptrategies.PopularDemStrategy;

public class FavorDemObserver extends ElectionObserver {

	public FavorDemObserver(Observable o) {
		super(o);
		this.setElec(new ElectoralHonestStrategy());
		this.setPop(new PopularDemStrategy());
		this.observerName="this observer favors democrats but won't admit it";
		}

}
