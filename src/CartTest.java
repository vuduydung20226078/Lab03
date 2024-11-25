public class CartTest{
    public static void main(String[] args) {
        Cart cart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 121, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", 18.99f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Alad", "Animation", 18.11f);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Doreamon", "Animation", 18.00f);

        // add 1 disc
        cart.addDigitalVideoDisc(dvd1);

        // add mang disc
        DigitalVideoDisc[] dvdArray = {dvd2, dvd3};
        cart.addDigitalVideoDisc(dvdArray);

        // add disc tuy y, tuong tu truyen mang nhung tien hon
        // cart.addDigitalVideoDisc(dvd1, dvd2, dvd3);

        // add 2 discs
        cart.addDigitalVideoDisc(dvd4, dvd5);
        //phan 6
        cart.print(); //5 discs (phan 2)
        
        System.out.println("\nSearch by ID:");
        DigitalVideoDisc foundById = cart.searchById(2); // Giả định DVD2 có ID là 2
        if (foundById != null) {
            System.out.println("Found: " + foundById);
        }

        System.out.println("\nSearch by Title:");
        DigitalVideoDisc foundByTitle = cart.searchByTitle("Star Wars");
        if (foundByTitle != null) {
            System.out.println("Found: " + foundByTitle);
        }
    }
}


