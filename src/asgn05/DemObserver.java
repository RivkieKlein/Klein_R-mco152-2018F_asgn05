package asgn05;

import implementedElecStrategies.ElectoralHonestStrategy;

public class DemObserver extends ElectionObserver{
	
	public DemObserver() {
		this.setElec(new ElectoralDemMostStrategy);
		this.setPop(new PopularDemStrategy);
		}
}
