import java.util.ArrayList;
import java.util.List;


public class CurrencyRepository implements Container {
    public static List<Double> currency = new ArrayList<Double>();
    public static final Double exchangeRatio = 2.69;
    static {
        currency.add(5.12);
        currency.add(3.0);
        currency.add(0.0);
        currency.add(2.27);
    }

    @Override
    public Iterator getIterator() {
        return new CurrencyIterator();
    }

    private class CurrencyIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {

            if (index < currency.size()) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {

            if (this.hasNext()) {
                return currency.get(index++) * exchangeRatio;
            }
            return null;
        }
        
        @Override
        public void remove() {
        }
    }
}
