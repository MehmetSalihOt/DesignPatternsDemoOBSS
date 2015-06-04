package StateDesignPattern;


public class SWEPContext implements State{
	private State swepDurum;

	public void setState(State state) {
		this.swepDurum=state;
	}

	public State getState() {
		return this.swepDurum;
	}

	@Override
	public void policeKes() {
		this.swepDurum.policeKes();
	}

}
