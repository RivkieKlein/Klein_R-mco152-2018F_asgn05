package asgn05;

import java.util.Observable;
import java.util.Observer;

public class FavorDemObserver extends ElectionObserver {

	public FavorDemObserver() {
		this.setElec(new ElectoralHonestStrategy);
		this.setPop(new PopularDemStrategy);
		}

}
