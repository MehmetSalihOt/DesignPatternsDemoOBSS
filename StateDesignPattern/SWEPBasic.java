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
			System.out.println("MSU Poli�e kesiyor..");
		}
		else if(state.equals("ACENTE")){
			System.out.println("ACENTE Poli�e kesiyor..");
		}
		else if(state.equals("BANKA")){
			System.out.println("BANKA Poli�e kesiyor..");
		}
		else if (state.equals("BOLGE")){
			System.out.println("BOLGE Poli�e kesiyor..");
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
