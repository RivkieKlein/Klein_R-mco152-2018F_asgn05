package asgn05;

import java.util.Observable;
import java.util.Observer;

import implementedElecStrategies.ElectoralHonestStrategy;
import implementedPoptrategies.PopularHonestStrategy;

public class HonestObserver extends ElectionObserver {
	public HonestObserver(Observable o) {
		super(o);
		this.setElec(new ElectoralHonestStrategy());
		this.setPop(new PopularHonestStrategy());
		this.observerName="this observer believes honesty is the best policy";
		}

}
