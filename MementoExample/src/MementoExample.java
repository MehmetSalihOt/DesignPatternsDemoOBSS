import java.util.List;



class MementoExample {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();

        Originator originator = new Originator();
        while(true) {
            String input = System.console().readLine();
            switch (input) {
                case "print" : {
                    List<Memento> all = caretaker.getAll();
                    for(int i = 0; i < all.size(); i++) {
                        System.out.println("\tMemento #" + i +": " + all.get(i).getSavedState());
                    }
                    break;
                }
                case "set" : {
                    System.out.print("\tEnter new state: ");
                    String readLine = System.console().readLine();
                    originator.set(readLine);
                    break;
                }
                case "save" : {
                    caretaker.addMemento(originator.saveToMemento());
                    break;
                }
                case "restore" : {
                    System.out.print("\tEnter state id: ");
                    String readLine = System.console().readLine();
                    originator.restoreFromMemento(caretaker.getMemento(Integer.parseInt(readLine)));
                    break;
                }
                case "current" : {
                    System.out.println("\tOriginator current state: " + originator.get());
                    break;
                }
                case "exit" : {
                    System.exit(0);
                    break;
                }
                default: {
                    System.out.println("Invalid command");
                }
            }
        }
    }
}
