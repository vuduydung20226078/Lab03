package hust.soict.dsai.aims.store;
import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
    private List<DigitalVideoDisc> itemsInStore = new ArrayList<>();

    // Method to add a DVD to the store
    public void addDVD(DigitalVideoDisc dvd) {
        if (dvd != null) {
            itemsInStore.add(dvd);
            System.out.println("Added DVD: " + dvd.getTitle() + " to the store.");
        } else {
            System.out.println("Cannot add null DVD to the store.");
        }
    }

    // Method to remove a DVD from the store by ID
    public void removeDVD(int id) {
        boolean found = false;
        for (int i = 0; i < itemsInStore.size(); i++) {
            if (itemsInStore.get(i).getId() == id) {
                System.out.println("Removed DVD: " + itemsInStore.get(i).getTitle() + " from the store.");
                itemsInStore.remove(i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No DVD found with ID: " + id);
        }
    }

    // Method to display all DVDs in the store
    public void displayStore() {
        System.out.println("******************* STORE *******************");
        if (itemsInStore.isEmpty()) {
            System.out.println("The store is empty.");
        } else {
            for (int i = 0; i < itemsInStore.size(); i++) {
                System.out.println((i + 1) + ". " + itemsInStore.get(i).toString());
            }
        }
        System.out.println("*********************************************");
    }
}
