
public class Aims {
	public static void main(String[] args) {
		Cart anOrder = new Cart();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		anOrder.addDigitalVideoDisc(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "Geogre Lucas", 87, 24.95f);
		anOrder.addDigitalVideoDisc(dvd2);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		anOrder.addDigitalVideoDisc(dvd3);
		
		System.out.println("Total Cost is: ");
		System.out.println(anOrder.totalCost());
		
        System.out.println("Removing 'Star Wars' from the cart:");
        anOrder.removeDigitalVideoDisc(dvd2); // Kiểm tra xóa dvd2

        System.out.println("Removing 'The Lion King' from the cart:");
        anOrder.removeDigitalVideoDisc(dvd1); // Kiểm tra xóa dvd1

        // In tổng chi phí sau khi xóa
        System.out.println("Total cost after removals: " + anOrder.totalCost());
    }
	
}
