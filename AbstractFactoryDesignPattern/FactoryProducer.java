package AbstractFactoryDesignPattern;

public class FactoryProducer {

	public static AbstractFactory getFactory(String choice){
		   
	      if(choice.equalsIgnoreCase("PoliceIslemleri")){
	         return new PoliceIslemleriFactory();
	         
	      }else if(choice.equalsIgnoreCase("EKIslemleri")){
	         return new EkIslemleriFactory();
	      }
	      
	      return null;
	   }
	
}
