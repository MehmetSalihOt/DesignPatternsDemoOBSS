package AbstractFactoryDesignPattern;

public class EkIslemleriFactory extends AbstractFactory{

	@Override
	Ek getEkIslemleri(String islem) {
		
		if(islem == null){
			return null;
			}
			if(islem.equals("MSU")){
				return new  MSUEk();
			}
			else if(islem.equals("ACENTE")){
				return new  ACENTEEk();
				
			}
			return null;
	}

	@Override
	Police getPoliceIslemleri(String islem) {
		
		return null;
	}

	
}
