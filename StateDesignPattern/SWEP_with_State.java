package StateDesignPattern;

public class SWEP_with_State {


public static void main (String[] args){
	
	SWEPContext context = new SWEPContext();
	
	State msuState = new SWEPMSU();
	State acenteState = new SWEPACENTE();
	State bolgeState = new SWEPBOLGE();
	State bankaState = new SWEPBANKA();


	context.setState(msuState);
	context.policeKes();

	context.setState(acenteState);
	context.policeKes();
	
	context.setState(bolgeState);
	context.policeKes();
	
	context.setState(bankaState);
	context.policeKes();
	
	
}	
}
