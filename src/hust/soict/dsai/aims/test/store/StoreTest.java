package hust.soict.dsai.aims.test.store;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        // Create sample DVDs
        DigitalVideoDisc dvd1 = new DigitalVideoDisc();
        dvd1.setId(1);
        dvd1.setTitle("The Lion King");
        dvd1.setCategory("Animation");
        dvd1.setDirector("Roger Allers");
        dvd1.setLength(90);
        dvd1.setPrice(19.95f);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc();
        dvd2.setId(2);
        dvd2.setTitle("Star Wars");
        dvd2.setCategory("Science Fiction");
        dvd2.setDirector("George Lucas");
        dvd2.setLength(124);
        dvd2.setPrice(24.95f);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc();
        dvd3.setId(3);
        dvd3.setTitle("Aladdin");
        dvd3.setCategory("Animation");
        dvd3.setDirector("Ron Clements");
        dvd3.setLength(90);
        dvd3.setPrice(18.99f);

        // Create a store and add DVDs
        Store store = new Store();
        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.addDVD(dvd3);

        // Display all DVDs in the store
        store.displayStore();

        // Remove a DVD from the store
        store.removeDVD(2); // Remove "Star Wars"

        // Display all DVDs in the store again
        store.displayStore();

        // Attempt to remove a non-existing DVD
        store.removeDVD(5); // No DVD with ID 5
    }
}
