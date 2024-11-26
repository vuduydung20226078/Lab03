package hust.soict.dsai.aims;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
public class Aims {
    public static void main(String[] args) {
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", 90, 18.99f);

        dvd1.displayInfo();
        System.out.println();
        dvd2.displayInfo();
        System.out.println();
        dvd3.displayInfo();
        System.out.println("\nTotal number of DVDs created: " + DigitalVideoDisc.getNbDigitalVideoDiscs());
    }
}
