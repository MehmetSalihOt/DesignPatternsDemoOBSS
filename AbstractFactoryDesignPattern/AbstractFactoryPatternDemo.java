package AbstractFactoryDesignPattern;

public class AbstractFactoryPatternDemo {


	public static void main(String[] args) {
		//poliçe iþlemleri yapacaðýz. Bir poliçeiþlemleri factory yarat
		AbstractFactory policeIslemleriFactory = FactoryProducer.getFactory("PoliceIslemleri");
		
		//MSU ile poliçe iþlemleri yapacaðýz. Bir MSU poliçe iþlemi objesi yarat.
		Police police = policeIslemleriFactory.getPoliceIslemleri("MSU");
		//MSU ile poliçe kes.
		police.policeKes();
		//ACENTE ile poliçe iþlemleri yapacaðýz. Bir ACENTE poliçe iþlemi objesi yarat.
		police = policeIslemleriFactory.getPoliceIslemleri("ACENTE");
		police.policeKes();

		//ek iþlemleri yapacaðýz. Bir ek iþlemleri factory yarat
		AbstractFactory ekIslemleriFactory = FactoryProducer.getFactory("EkIslemleri");
		//MSU ile ek iþlemleri yapacaðýz. Bir ek poliçe iþlemi objesi yarat.
		Ek ek = ekIslemleriFactory.getEkIslemleri("MSU");
		//MSU ile ek yap
		ek.ekYap();
		//ACENTE ile ek iþlemleri yapacaðýz. Bir ACENTE ek iþlemi objesi yarat.
		ek = ekIslemleriFactory.getEkIslemleri("ACENTE");
		//Acente ile ek yap
		ek.ekYap();

	}

}
