package asgn05;

public class HonestObserver extends ElectionObserver {
	public HonestObserver() {
		this.setElec(new ElectoralHonestStrategy);
		this.setPop(new PopularHonestStrategy);
		}

}
