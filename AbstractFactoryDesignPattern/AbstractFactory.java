package AbstractFactoryDesignPattern;

abstract class AbstractFactory {//Factorty of factory. Yani PoliceISlemleri ile EkISlemleri nin factory si
	abstract Police getPoliceIslemleri(String kullanici);

	abstract Ek getEkIslemleri(String kullanici);
}
