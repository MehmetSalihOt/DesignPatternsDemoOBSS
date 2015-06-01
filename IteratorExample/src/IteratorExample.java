public class IteratorExample {

    public static void main(String[] args) {
        CurrencyRepository currencyRepository = new CurrencyRepository();

        Iterator iterator1 = currencyRepository.getIterator();
		Iterator iterator2 = currencyRepository.getIterator();
        
		while(iterator1.hasNext()) {
			System.out.println(iterator1.next() + " " + iterator2.next());
		}
        
    }
}
