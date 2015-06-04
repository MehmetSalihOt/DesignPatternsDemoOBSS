package AbstractFactoryDesignPattern;

public class PoliceIslemleriFactory extends AbstractFactory{

	@Override
	Ek getEkIslemleri(String kullanici) {
		
		return null;
	}

	@Override
	Police getPoliceIslemleri(String islem) {
		if(islem == null){
		return null;
		}
		if(islem.equals("MSU")){
			return new  MSUPolice();
		}
		else if(islem.equals("ACENTE")){
			return new  ACENTEPolice();
			
		}
		return null;
	}

	
}
