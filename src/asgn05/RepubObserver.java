package asgn05;

import java.util.Observable;

import implementedElecStrategies.ElectoralRepubSetStateStrategy;
import implementedPoptrategies.PopularRepubStrategy;

public class RepubObserver extends ElectionObserver {

	public RepubObserver(Observable o) {
		super(o);
		this.setElec(new ElectoralRepubSetStateStrategy());
		this.setPop(new PopularRepubStrategy());
		this.observerName="This display favors republicans";
	}

}
