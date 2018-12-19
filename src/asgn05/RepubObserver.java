package asgn05;

public class RepubObserver extends ElectionObserver {

	public RepubObserver() {
		this.setElec(new ElectoralRepubSetStateStrategy);
		this.setPop(new PopularRepubStrategy);
		}

}
