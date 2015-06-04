package StateDesignPattern;

public class SWEPBasic {
	
	private String state="";

	public void setState(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}
	
	public void policeKes(){
		if(state.equals("MSU")){
			System.out.println("MSU Poliçe kesiyor..");
		}
		else if(state.equals("ACENTE")){
			System.out.println("ACENTE Poliçe kesiyor..");
		}
		else if(state.equals("BANKA")){
			System.out.println("BANKA Poliçe kesiyor..");
		}
		else if (state.equals("BOLGE")){
			System.out.println("BOLGE Poliçe kesiyor..");
		}
		
	}	
	public static void main(String[] args){
		SWEPBasic swep = new SWEPBasic();
		swep.setState("MSU");
		swep.policeKes();
		swep.setState("ACENTE");
		swep.policeKes();
		swep.setState("BOLGE");
		swep.policeKes();
		swep.setState("BANKA");
		swep.policeKes();
		
	}

}
