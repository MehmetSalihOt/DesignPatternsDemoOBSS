public class Originator {
    private String state;

    /*
     * lots of memory consumptive private data that is not necessary to define the state and should
     * thus not be saved. Hence the small memento object.
     */

    public void set(String state) {
        System.out.println("\tOriginator: Setting state to " + state);
        this.state = state;
    }
    
    public String get() {
        return this.state;
    }

    public Memento saveToMemento() {
        System.out.println("\tOriginator: Saving to Memento " + state);
        return new Memento(state);
    }

    public void restoreFromMemento(Memento m) {
        state = m.getSavedState();
        System.out.println("\tOriginator: State after restoring from Memento: " + state);
    }
}