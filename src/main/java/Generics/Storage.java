package Generics;

import java.util.ArrayList;
import java.util.List;

public class Storage<T extends Edible> {
    List<T> listOfItems;

    public Storage() {
        listOfItems = new ArrayList<T>();
    }

    public Storage(List<T> listOfItems) {
        this.listOfItems = listOfItems;
    }

    public List<T> getListOfItems() {
        return listOfItems;
    }

    public void setListOfItems(List<T> listOfItems) {
        this.listOfItems = listOfItems;
    }

    public void addItem(T item) {
        listOfItems.add(item);
    }

    public T retrieveItem() {
        T returnItem = listOfItems.get(listOfItems.size() - 1);
        listOfItems.remove(listOfItems.size() - 1);
        return returnItem;
    }
}

