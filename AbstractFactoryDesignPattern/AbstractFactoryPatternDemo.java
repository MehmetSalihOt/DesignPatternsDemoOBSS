package AbstractFactoryDesignPattern;

public class AbstractFactoryPatternDemo {


	public static void main(String[] args) {
		//poli�e i�lemleri yapaca��z. Bir poli�ei�lemleri factory yarat
		AbstractFactory policeIslemleriFactory = FactoryProducer.getFactory("PoliceIslemleri");
		
		//MSU ile poli�e i�lemleri yapaca��z. Bir MSU poli�e i�lemi objesi yarat.
		Police police = policeIslemleriFactory.getPoliceIslemleri("MSU");
		//MSU ile poli�e kes.
		police.policeKes();
		//ACENTE ile poli�e i�lemleri yapaca��z. Bir ACENTE poli�e i�lemi objesi yarat.
		police = policeIslemleriFactory.getPoliceIslemleri("ACENTE");
		police.policeKes();

		//ek i�lemleri yapaca��z. Bir ek i�lemleri factory yarat
		AbstractFactory ekIslemleriFactory = FactoryProducer.getFactory("EkIslemleri");
		//MSU ile ek i�lemleri yapaca��z. Bir ek poli�e i�lemi objesi yarat.
		Ek ek = ekIslemleriFactory.getEkIslemleri("MSU");
		//MSU ile ek yap
		ek.ekYap();
		//ACENTE ile ek i�lemleri yapaca��z. Bir ACENTE ek i�lemi objesi yarat.
		ek = ekIslemleriFactory.getEkIslemleri("ACENTE");
		//Acente ile ek yap
		ek.ekYap();

	}

}
