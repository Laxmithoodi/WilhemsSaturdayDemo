package Generics;

import java.util.LinkedList;

public class Fridge {

    private Storage<Edible> storage;

    public Edible getItem(String type) {
        LinkedList<Edible> retrievedItems = new LinkedList<Edible>();
        retrievedItems.add(storage.retrieveItem());

        while (! retrievedItems.getLast().getLabel().equals(type)) {
            retrievedItems.add(storage.retrieveItem());
            if (retrievedItems.getLast() == null) {
                break;
            }
        }

        for (int i = 0; i < retrievedItems.size() - 2; i++) {
            storage.addItem(retrievedItems.get(i));
        }

        return retrievedItems.getLast();
    }

    public void storeItem(Edible edible) {
        storage.addItem(edible);
    }
}

